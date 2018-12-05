package frc.team319.commands;

import frc.team319.models.BobTalonSRX;
import frc.team319.models.SrxMotionProfile;
import frc.team319.models.SrxTrajectory;
import frc.robot.RobotMap;

import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motion.TrajectoryPoint;
import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Notifier;
import edu.wpi.first.wpilibj.command.Command;

public class FollowTrajectory extends Command {

	private BobTalonSRX rightTalon = RobotMap.frontRightTalon;
	private BobTalonSRX leftTalon = RobotMap.frontLeftTalon;

	private String trajectoryName = "";
	private int kMinPointsInTalon = 5;

	private boolean isFinished = false;

	private SrxTrajectory trajectoryToFollow = null;

	private MotionProfileStatus rightStatus = new MotionProfileStatus();
	private MotionProfileStatus leftStatus = new MotionProfileStatus();

	private boolean hasPathStarted = false;

	/**
	 * this is only either Disable, Enable, or Hold. Since we'd never want one side
	 * to be enabled while the other is disabled, we'll use the same status for both
	 * sides.
	 */
	private SetValueMotionProfile setValue = SetValueMotionProfile.Disable;

	private class BufferLoader implements java.lang.Runnable {
		private int leftLastPointSent = 0;
		private int rightLastPointSent = 0;

		public BufferLoader() {
			this.leftLastPointSent = 0;
			this.rightLastPointSent = 0;
		}

		public void run() {
			leftTalon.processMotionProfileBuffer();
			rightTalon.processMotionProfileBuffer();
			leftLastPointSent = manageBuffer(leftTalon, trajectoryToFollow.leftProfile,
					RobotMap.LINEAR_PIDF_SLOT, leftLastPointSent);
			rightLastPointSent = manageBuffer(rightTalon, trajectoryToFollow.rightProfile,
					RobotMap.LINEAR_PIDF_SLOT, rightLastPointSent);
		}

		private int manageBuffer(BobTalonSRX talon, SrxMotionProfile prof, int pidfSlot, int lastPointSent) {
			if (lastPointSent >= prof.numPoints) {
				return lastPointSent;
			}

			if (!talon.isMotionProfileTopLevelBufferFull() && lastPointSent < prof.numPoints) {
				TrajectoryPoint point = new TrajectoryPoint();
				/* for each point, fill our structure and pass it to API */
				point.position = prof.points[lastPointSent][0];
				point.velocity = prof.points[lastPointSent][1];
				point.timeDur = getTrajectoryDuration((int) prof.points[lastPointSent][2]);
				point.profileSlotSelect0 = pidfSlot;
				point.profileSlotSelect1 = pidfSlot;
				point.zeroPos = false;
				if (lastPointSent == 0) {
					point.zeroPos = true; /* set this to true on the first point */

				}
				point.isLastPoint = false;
				if ((lastPointSent + 1) == prof.numPoints) {
					point.isLastPoint = true; /* set this to true on the last point */
				}
				talon.pushMotionProfileTrajectory(point);
				lastPointSent++;
			}
			return lastPointSent;
		}

		private TrajectoryDuration getTrajectoryDuration(int ms) {
			TrajectoryDuration retval = TrajectoryDuration.Trajectory_Duration_0ms;

			retval = retval.valueOf(ms);

			return retval;
		}

	}

	// Runs the runnable
	private Notifier bufferNotifier;

	// constructor
	public FollowTrajectory(String trajectoryName) {
		requires(RobotMap.drivetrain);
		this.trajectoryName = trajectoryName;
	}

	public FollowTrajectory(SrxTrajectory trajectoryToFollow) {
		requires(RobotMap.drivetrain);
		this.trajectoryToFollow = trajectoryToFollow;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		this.hasPathStarted = false;
		setUpTalon(rightTalon);
		setUpTalon(leftTalon);

		System.out.println("talons set up");

		setValue = SetValueMotionProfile.Disable;

		leftTalon.set(ControlMode.MotionProfile, setValue.value);
		rightTalon.set(ControlMode.MotionProfile, setValue.value);

		bufferNotifier = new Notifier(new BufferLoader());
		bufferNotifier.startPeriodic(.005);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

		System.out.println(rightTalon.getMotionProfileStatus(rightStatus));
		System.out.println(leftTalon.getMotionProfileStatus(leftStatus));

		//Underrun?
		if (rightStatus.isUnderrun || leftStatus.isUnderrun) {
			// if either MP has underrun, stop both
			System.out.println("Motion profile has underrun!");
			setValue = SetValueMotionProfile.Disable;
		} else if (rightStatus.btmBufferCnt > kMinPointsInTalon && leftStatus.btmBufferCnt > kMinPointsInTalon) {
			// if we have enough points in the talon, go.
			setValue = SetValueMotionProfile.Enable;
			System.out.println("Yay1");
			hasPathStarted = true;
		} else if (rightStatus.activePointValid && rightStatus.isLast && leftStatus.activePointValid
				&& leftStatus.isLast) {
			// if both profiles are at their last points, hold the last point
			setValue = SetValueMotionProfile.Hold;
			System.out.println("HOLDING LAST POINT!!!!!");
		}

		leftTalon.set(ControlMode.MotionProfile, setValue.value);
		rightTalon.set(ControlMode.MotionProfile, setValue.value);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		if (!hasPathStarted) {
			return false;
		}
		boolean leftComplete = leftStatus.activePointValid && leftStatus.isLast;
		boolean rightComplete = rightStatus.activePointValid && rightStatus.isLast;
		// System.out.println("Complete: " + leftComplete + "," + rightComplete);
		boolean trajectoryComplete = leftComplete && rightComplete;
		if (trajectoryComplete) {
			System.out.println("Finished Trajectory");
		}
		return trajectoryComplete || isFinished;
	}

	// Called once after isFinished returns true
	protected void end() {
		cleanUp();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		cleanUp();
	}

	public void cleanUp() {
		resetTalon(rightTalon, ControlMode.PercentOutput, 0);
		resetTalon(leftTalon, ControlMode.PercentOutput, 0);
		bufferNotifier.stop();
	}

	//Define prepare
	// set up the talon for motion profile control
	public void setUpTalon(TalonSRX talon) {
		talon.clearMotionProfileTrajectories();
		talon.changeMotionControlFramePeriod(5); //Nani?
	}

	// set the to the desired controlMode
	// used at the end of the motion profile
	public void resetTalon(TalonSRX talon, ControlMode controlMode, double setValue) {
		// System.out.println("Clearing MP Trajectories");
		talon.clearMotionProfileTrajectories();
		talon.set(ControlMode.MotionProfile, SetValueMotionProfile.Disable.value);
		talon.set(controlMode, setValue);
	}
}