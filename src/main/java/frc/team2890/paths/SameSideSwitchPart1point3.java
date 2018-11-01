package frc.team2890.paths;

import frc.team319.models.SrxMotionProfile;
import frc.team319.models.SrxTrajectory;

public class SameSideSwitchPart1point3 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (1.88,0.00,0.00)
	
	public SameSideSwitchPart1point3() {
		this(false);
	}
			
    public SameSideSwitchPart1point3(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.015,0.291,10.000},
				{0.073,0.582,10.000},
				{0.204,1.310,10.000},
				{0.437,2.329,10.000},
				{0.800,3.639,10.000},
				{1.310,5.094,10.000},
				{1.965,6.549,10.000},
				{2.765,8.005,10.000},
				{3.711,9.460,10.000},
				{4.803,10.916,10.000},
				{6.040,12.371,10.000},
				{7.423,13.827,10.000},
				{8.951,15.282,10.000},
				{10.625,16.738,10.000},
				{12.444,18.193,10.000},
				{14.409,19.648,10.000},
				{16.519,21.104,10.000},
				{18.775,22.559,10.000},
				{21.177,24.015,10.000},
				{23.724,25.470,10.000},
				{26.416,26.926,10.000},
				{29.254,28.381,10.000},
				{32.238,29.836,10.000},
				{35.367,31.292,10.000},
				{38.642,32.747,10.000},
				{42.062,34.203,10.000},
				{45.628,35.658,10.000},
				{49.339,37.114,10.000},
				{53.196,38.569,10.000},
				{57.199,40.025,10.000},
				{61.347,41.480,10.000},
				{65.640,42.935,10.000},
				{70.079,44.391,10.000},
				{74.664,45.846,10.000},
				{79.394,47.302,10.000},
				{84.270,48.757,10.000},
				{89.291,50.213,10.000},
				{94.458,51.668,10.000},
				{99.770,53.123,10.000},
				{105.228,54.579,10.000},
				{110.832,56.034,10.000},
				{116.581,57.490,10.000},
				{122.475,58.945,10.000},
				{128.515,60.401,10.000},
				{134.701,61.856,10.000},
				{141.032,63.312,10.000},
				{147.509,64.767,10.000},
				{154.131,66.222,10.000},
				{160.899,67.678,10.000},
				{167.812,69.133,10.000},
				{174.871,70.589,10.000},
				{182.075,72.044,10.000},
				{189.425,73.500,10.000},
				{196.921,74.955,10.000},
				{204.562,76.410,10.000},
				{212.348,77.866,10.000},
				{220.280,79.321,10.000},
				{228.358,80.777,10.000},
				{236.581,82.232,10.000},
				{244.950,83.688,10.000},
				{253.464,85.143,10.000},
				{262.124,86.599,10.000},
				{270.930,88.054,10.000},
				{279.881,89.509,10.000},
				{288.977,90.965,10.000},
				{298.219,92.420,10.000},
				{307.607,93.876,10.000},
				{317.140,95.331,10.000},
				{326.818,96.787,10.000},
				{336.643,98.242,10.000},
				{346.612,99.697,10.000},
				{356.728,101.153,10.000},
				{366.988,102.608,10.000},
				{377.395,104.064,10.000},
				{387.947,105.519,10.000},
				{398.644,106.975,10.000},
				{409.487,108.430,10.000},
				{420.461,109.740,10.000},
				{431.537,110.759,10.000},
				{442.686,111.486,10.000},
				{453.878,111.923,10.000},
				{465.079,112.010,10.000},
				{476.254,111.747,10.000},
				{487.373,111.193,10.000},
				{498.408,110.348,10.000},
				{509.329,109.211,10.000},
				{520.113,107.843,10.000},
				{530.752,106.387,10.000},
				{541.245,104.932,10.000},
				{551.593,103.476,10.000},
				{561.795,102.021,10.000},
				{571.851,100.566,10.000},
				{581.762,99.110,10.000},
				{591.528,97.655,10.000},
				{601.148,96.199,10.000},
				{610.622,94.744,10.000},
				{619.951,93.288,10.000},
				{629.134,91.833,10.000},
				{638.172,90.377,10.000},
				{647.064,88.922,10.000},
				{655.811,87.467,10.000},
				{664.412,86.011,10.000},
				{672.868,84.556,10.000},
				{681.178,83.100,10.000},
				{689.342,81.645,10.000},
				{697.361,80.189,10.000},
				{705.235,78.734,10.000},
				{712.962,77.279,10.000},
				{720.545,75.823,10.000},
				{727.981,74.368,10.000},
				{735.273,72.912,10.000},
				{742.418,71.457,10.000},
				{749.419,70.001,10.000},
				{756.273,68.546,10.000},
				{762.982,67.091,10.000},
				{769.546,65.635,10.000},
				{775.964,64.180,10.000},
				{782.236,62.724,10.000},
				{788.363,61.269,10.000},
				{794.344,59.813,10.000},
				{800.180,58.358,10.000},
				{805.870,56.902,10.000},
				{811.415,55.447,10.000},
				{816.814,53.992,10.000},
				{822.068,52.536,10.000},
				{827.176,51.081,10.000},
				{832.138,49.625,10.000},
				{836.955,48.170,10.000},
				{841.627,46.714,10.000},
				{846.153,45.259,10.000},
				{850.533,43.804,10.000},
				{854.768,42.348,10.000},
				{858.857,40.893,10.000},
				{862.801,39.437,10.000},
				{866.599,37.982,10.000},
				{870.252,36.526,10.000},
				{873.759,35.071,10.000},
				{877.120,33.615,10.000},
				{880.336,32.160,10.000},
				{883.407,30.705,10.000},
				{886.332,29.249,10.000},
				{889.111,27.794,10.000},
				{891.745,26.338,10.000},
				{894.233,24.883,10.000},
				{896.576,23.427,10.000},
				{898.773,21.972,10.000},
				{900.825,20.517,10.000},
				{902.731,19.061,10.000},
				{904.491,17.606,10.000},
				{906.106,16.150,10.000},
				{907.576,14.695,10.000},
				{908.900,13.239,10.000},
				{910.078,11.784,10.000},
				{911.111,10.328,10.000},
				{911.998,8.873,10.000},
				{912.740,7.418,10.000},
				{913.336,5.962,10.000},
				{913.787,4.507,10.000},
				{914.098,3.110,10.000},
				{914.290,1.918,10.000},
				{914.391,1.016,10.000},
				{914.432,0.406,10.000},
				{914.441,0.087,10.000},
				{914.441,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.015,-0.291,10.000},
				{-0.073,-0.582,10.000},
				{-0.204,-1.310,10.000},
				{-0.437,-2.329,10.000},
				{-0.800,-3.639,10.000},
				{-1.310,-5.094,10.000},
				{-1.965,-6.549,10.000},
				{-2.765,-8.005,10.000},
				{-3.711,-9.460,10.000},
				{-4.803,-10.916,10.000},
				{-6.040,-12.371,10.000},
				{-7.423,-13.827,10.000},
				{-8.951,-15.282,10.000},
				{-10.625,-16.738,10.000},
				{-12.444,-18.193,10.000},
				{-14.409,-19.648,10.000},
				{-16.519,-21.104,10.000},
				{-18.775,-22.559,10.000},
				{-21.177,-24.015,10.000},
				{-23.724,-25.470,10.000},
				{-26.416,-26.926,10.000},
				{-29.254,-28.381,10.000},
				{-32.238,-29.836,10.000},
				{-35.367,-31.292,10.000},
				{-38.642,-32.747,10.000},
				{-42.062,-34.203,10.000},
				{-45.628,-35.658,10.000},
				{-49.339,-37.114,10.000},
				{-53.196,-38.569,10.000},
				{-57.199,-40.025,10.000},
				{-61.347,-41.480,10.000},
				{-65.640,-42.935,10.000},
				{-70.079,-44.391,10.000},
				{-74.664,-45.846,10.000},
				{-79.394,-47.302,10.000},
				{-84.270,-48.757,10.000},
				{-89.291,-50.213,10.000},
				{-94.458,-51.668,10.000},
				{-99.770,-53.123,10.000},
				{-105.228,-54.579,10.000},
				{-110.832,-56.034,10.000},
				{-116.581,-57.490,10.000},
				{-122.475,-58.945,10.000},
				{-128.515,-60.401,10.000},
				{-134.701,-61.856,10.000},
				{-141.032,-63.312,10.000},
				{-147.509,-64.767,10.000},
				{-154.131,-66.222,10.000},
				{-160.899,-67.678,10.000},
				{-167.812,-69.133,10.000},
				{-174.871,-70.589,10.000},
				{-182.075,-72.044,10.000},
				{-189.425,-73.500,10.000},
				{-196.921,-74.955,10.000},
				{-204.562,-76.410,10.000},
				{-212.348,-77.866,10.000},
				{-220.280,-79.321,10.000},
				{-228.358,-80.777,10.000},
				{-236.581,-82.232,10.000},
				{-244.950,-83.688,10.000},
				{-253.464,-85.143,10.000},
				{-262.124,-86.599,10.000},
				{-270.930,-88.054,10.000},
				{-279.881,-89.509,10.000},
				{-288.977,-90.965,10.000},
				{-298.219,-92.420,10.000},
				{-307.607,-93.876,10.000},
				{-317.140,-95.331,10.000},
				{-326.818,-96.787,10.000},
				{-336.643,-98.242,10.000},
				{-346.612,-99.697,10.000},
				{-356.728,-101.153,10.000},
				{-366.988,-102.608,10.000},
				{-377.395,-104.064,10.000},
				{-387.947,-105.519,10.000},
				{-398.644,-106.975,10.000},
				{-409.487,-108.430,10.000},
				{-420.461,-109.740,10.000},
				{-431.537,-110.759,10.000},
				{-442.686,-111.486,10.000},
				{-453.878,-111.923,10.000},
				{-465.079,-112.010,10.000},
				{-476.254,-111.747,10.000},
				{-487.373,-111.193,10.000},
				{-498.408,-110.348,10.000},
				{-509.329,-109.211,10.000},
				{-520.113,-107.843,10.000},
				{-530.752,-106.387,10.000},
				{-541.245,-104.932,10.000},
				{-551.593,-103.476,10.000},
				{-561.795,-102.021,10.000},
				{-571.851,-100.566,10.000},
				{-581.762,-99.110,10.000},
				{-591.528,-97.655,10.000},
				{-601.148,-96.199,10.000},
				{-610.622,-94.744,10.000},
				{-619.951,-93.288,10.000},
				{-629.134,-91.833,10.000},
				{-638.172,-90.377,10.000},
				{-647.064,-88.922,10.000},
				{-655.811,-87.467,10.000},
				{-664.412,-86.011,10.000},
				{-672.868,-84.556,10.000},
				{-681.178,-83.100,10.000},
				{-689.342,-81.645,10.000},
				{-697.361,-80.189,10.000},
				{-705.235,-78.734,10.000},
				{-712.962,-77.279,10.000},
				{-720.545,-75.823,10.000},
				{-727.981,-74.368,10.000},
				{-735.273,-72.912,10.000},
				{-742.418,-71.457,10.000},
				{-749.419,-70.001,10.000},
				{-756.273,-68.546,10.000},
				{-762.982,-67.091,10.000},
				{-769.546,-65.635,10.000},
				{-775.964,-64.180,10.000},
				{-782.236,-62.724,10.000},
				{-788.363,-61.269,10.000},
				{-794.344,-59.813,10.000},
				{-800.180,-58.358,10.000},
				{-805.870,-56.902,10.000},
				{-811.415,-55.447,10.000},
				{-816.814,-53.992,10.000},
				{-822.068,-52.536,10.000},
				{-827.176,-51.081,10.000},
				{-832.138,-49.625,10.000},
				{-836.955,-48.170,10.000},
				{-841.627,-46.714,10.000},
				{-846.153,-45.259,10.000},
				{-850.533,-43.804,10.000},
				{-854.768,-42.348,10.000},
				{-858.857,-40.893,10.000},
				{-862.801,-39.437,10.000},
				{-866.599,-37.982,10.000},
				{-870.252,-36.526,10.000},
				{-873.759,-35.071,10.000},
				{-877.120,-33.615,10.000},
				{-880.336,-32.160,10.000},
				{-883.407,-30.705,10.000},
				{-886.332,-29.249,10.000},
				{-889.111,-27.794,10.000},
				{-891.745,-26.338,10.000},
				{-894.233,-24.883,10.000},
				{-896.576,-23.427,10.000},
				{-898.773,-21.972,10.000},
				{-900.825,-20.517,10.000},
				{-902.731,-19.061,10.000},
				{-904.491,-17.606,10.000},
				{-906.106,-16.150,10.000},
				{-907.576,-14.695,10.000},
				{-908.900,-13.239,10.000},
				{-910.078,-11.784,10.000},
				{-911.111,-10.328,10.000},
				{-911.998,-8.873,10.000},
				{-912.740,-7.418,10.000},
				{-913.336,-5.962,10.000},
				{-913.787,-4.507,10.000},
				{-914.098,-3.110,10.000},
				{-914.290,-1.918,10.000},
				{-914.391,-1.016,10.000},
				{-914.432,-0.406,10.000},
				{-914.441,-0.087,10.000},
				{-914.441,-0.000,10.000}
		};
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}