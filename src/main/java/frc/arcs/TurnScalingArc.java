package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class TurnScalingArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.00,13.50,0.00)
	// (5.00,16.50,89.99)
	
    public TurnScalingArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public TurnScalingArc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{0.000,0.000,10.000,0.000},
				{3.129,31.291,10.000,0.000},
				{9.387,62.582,10.000,0.000},
				{18.775,93.873,10.000,0.000},
				{31.291,125.165,10.000,0.000},
				{46.937,156.456,10.000,0.000},
				{65.711,187.747,10.000,0.000},
				{87.615,219.038,10.000,0.000},
				{112.648,250.329,10.000,0.000},
				{140.810,281.620,10.000,0.010},
				{172.101,312.911,10.000,0.010},
				{206.521,344.202,10.000,0.010},
				{244.071,375.494,10.000,0.020},
				{284.749,406.785,10.000,0.030},
				{328.557,438.076,10.000,0.030},
				{375.494,469.367,10.000,0.040},
				{425.559,500.658,10.000,0.060},
				{478.754,531.949,10.000,0.070},
				{535.078,563.240,10.000,0.090},
				{594.532,594.532,10.000,0.110},
				{657.114,625.823,10.000,0.130},
				{722.825,657.114,10.000,0.160},
				{791.666,688.405,10.000,0.190},
				{863.635,719.696,10.000,0.230},
				{938.734,750.987,10.000,0.270},
				{1016.962,782.278,10.000,0.320},
				{1098.319,813.570,10.000,0.370},
				{1182.805,844.861,10.000,0.430},
				{1270.420,876.152,10.000,0.490},
				{1361.164,907.443,10.000,0.570},
				{1455.038,938.734,10.000,0.650},
				{1552.040,970.025,10.000,0.730},
				{1652.172,1001.316,10.000,0.830},
				{1755.433,1032.607,10.000,0.940},
				{1861.823,1063.899,10.000,1.060},
				{1971.342,1095.190,10.000,1.180},
				{2083.990,1126.481,10.000,1.320},
				{2199.767,1157.772,10.000,1.480},
				{2317.109,1173.418,10.000,1.640},
				{2434.450,1173.418,10.000,1.810},
				{2551.792,1173.418,10.000,1.990},
				{2669.134,1173.418,10.000,2.180},
				{2786.476,1173.418,10.000,2.390},
				{2903.817,1173.418,10.000,2.600},
				{3021.159,1173.418,10.000,2.820},
				{3138.501,1173.418,10.000,3.050},
				{3255.843,1173.418,10.000,3.290},
				{3373.184,1173.418,10.000,3.540},
				{3490.526,1173.418,10.000,3.800},
				{3607.868,1173.418,10.000,4.070},
				{3725.210,1173.418,10.000,4.350},
				{3842.551,1173.418,10.000,4.650},
				{3959.893,1173.418,10.000,4.960},
				{4077.235,1173.418,10.000,5.270},
				{4194.577,1173.418,10.000,5.610},
				{4311.918,1173.418,10.000,5.950},
				{4429.260,1173.418,10.000,6.310},
				{4546.602,1173.418,10.000,6.680},
				{4663.944,1173.418,10.000,7.060},
				{4781.285,1173.418,10.000,7.460},
				{4898.627,1173.418,10.000,7.870},
				{5015.969,1173.418,10.000,8.300},
				{5133.311,1173.418,10.000,8.740},
				{5250.652,1173.418,10.000,9.200},
				{5367.994,1173.418,10.000,9.670},
				{5485.336,1173.418,10.000,10.160},
				{5602.678,1173.418,10.000,10.670},
				{5720.019,1173.418,10.000,11.190},
				{5837.361,1173.418,10.000,11.740},
				{5954.703,1173.418,10.000,12.300},
				{6072.045,1173.418,10.000,12.880},
				{6189.387,1173.418,10.000,13.480},
				{6306.728,1173.418,10.000,14.100},
				{6424.070,1173.418,10.000,14.740},
				{6541.412,1173.418,10.000,15.400},
				{6658.754,1173.418,10.000,16.080},
				{6776.095,1173.418,10.000,16.780},
				{6893.437,1173.418,10.000,17.510},
				{7010.779,1173.418,10.000,18.260},
				{7128.121,1173.418,10.000,19.030},
				{7245.462,1173.418,10.000,19.820},
				{7362.804,1173.418,10.000,20.640},
				{7480.146,1173.418,10.000,21.480},
				{7597.488,1173.418,10.000,22.340},
				{7714.829,1173.418,10.000,23.230},
				{7832.171,1173.418,10.000,24.150},
				{7949.513,1173.418,10.000,25.080},
				{8066.855,1173.418,10.000,26.040},
				{8184.196,1173.418,10.000,27.030},
				{8301.538,1173.418,10.000,28.040},
				{8418.880,1173.418,10.000,29.060},
				{8536.222,1173.418,10.000,30.120},
				{8653.563,1173.418,10.000,31.190},
				{8770.905,1173.418,10.000,32.280},
				{8888.247,1173.418,10.000,33.390},
				{9005.589,1173.418,10.000,34.520},
				{9122.930,1173.418,10.000,35.670},
				{9240.272,1173.418,10.000,36.830},
				{9357.614,1173.418,10.000,38.000},
				{9474.956,1173.418,10.000,39.190},
				{9592.297,1173.418,10.000,40.380},
				{9709.639,1173.418,10.000,41.590},
				{9826.981,1173.418,10.000,42.800},
				{9944.323,1173.418,10.000,44.010},
				{10061.664,1173.418,10.000,45.220},
				{10179.006,1173.418,10.000,46.440},
				{10296.348,1173.418,10.000,47.650},
				{10413.690,1173.418,10.000,48.860},
				{10531.032,1173.418,10.000,50.060},
				{10648.373,1173.418,10.000,51.250},
				{10765.715,1173.418,10.000,52.430},
				{10883.057,1173.418,10.000,53.600},
				{11000.399,1173.418,10.000,54.760},
				{11117.740,1173.418,10.000,55.900},
				{11235.082,1173.418,10.000,57.020},
				{11352.424,1173.418,10.000,58.120},
				{11469.766,1173.418,10.000,59.210},
				{11587.107,1173.418,10.000,60.270},
				{11704.449,1173.418,10.000,61.320},
				{11821.791,1173.418,10.000,62.340},
				{11939.133,1173.418,10.000,63.340},
				{12056.474,1173.418,10.000,64.310},
				{12173.816,1173.418,10.000,65.260},
				{12291.158,1173.418,10.000,66.190},
				{12408.500,1173.418,10.000,67.090},
				{12525.841,1173.418,10.000,67.970},
				{12643.183,1173.418,10.000,68.830},
				{12760.525,1173.418,10.000,69.660},
				{12877.867,1173.418,10.000,70.470},
				{12995.208,1173.418,10.000,71.260},
				{13112.550,1173.418,10.000,72.020},
				{13229.892,1173.418,10.000,72.760},
				{13347.234,1173.418,10.000,73.470},
				{13464.575,1173.418,10.000,74.170},
				{13581.917,1173.418,10.000,74.840},
				{13699.259,1173.418,10.000,75.500},
				{13816.601,1173.418,10.000,76.130},
				{13933.942,1173.418,10.000,76.740},
				{14051.284,1173.418,10.000,77.330},
				{14168.626,1173.418,10.000,77.900},
				{14285.968,1173.418,10.000,78.460},
				{14403.309,1173.418,10.000,79.000},
				{14520.651,1173.418,10.000,79.510},
				{14637.993,1173.418,10.000,80.010},
				{14755.335,1173.418,10.000,80.500},
				{14872.676,1173.418,10.000,80.970},
				{14990.018,1173.418,10.000,81.420},
				{15107.360,1173.418,10.000,81.850},
				{15224.702,1173.418,10.000,82.280},
				{15342.044,1173.418,10.000,82.680},
				{15459.385,1173.418,10.000,83.070},
				{15576.727,1173.418,10.000,83.450},
				{15694.069,1173.418,10.000,83.820},
				{15811.411,1173.418,10.000,84.170},
				{15928.752,1173.418,10.000,84.510},
				{16046.094,1173.418,10.000,84.840},
				{16163.436,1173.418,10.000,85.150},
				{16280.778,1173.418,10.000,85.450},
				{16398.119,1173.418,10.000,85.740},
				{16515.461,1173.418,10.000,86.020},
				{16632.803,1173.418,10.000,86.290},
				{16750.145,1173.418,10.000,86.550},
				{16867.486,1173.418,10.000,86.790},
				{16984.828,1173.418,10.000,87.030},
				{17102.170,1173.418,10.000,87.260},
				{17219.512,1173.418,10.000,87.470},
				{17336.853,1173.418,10.000,87.680},
				{17454.195,1173.418,10.000,87.880},
				{17571.537,1173.418,10.000,88.060},
				{17688.879,1173.418,10.000,88.240},
				{17806.220,1173.418,10.000,88.410},
				{17923.562,1173.418,10.000,88.570},
				{18040.904,1173.418,10.000,88.720},
				{18155.117,1142.126,10.000,88.860},
				{18266.200,1110.835,10.000,88.990},
				{18374.155,1079.544,10.000,89.100},
				{18478.980,1048.253,10.000,89.210},
				{18580.676,1016.962,10.000,89.300},
				{18679.243,985.671,10.000,89.390},
				{18774.681,954.380,10.000,89.470},
				{18866.990,923.088,10.000,89.540},
				{18956.170,891.797,10.000,89.600},
				{19042.220,860.506,10.000,89.660},
				{19125.142,829.215,10.000,89.710},
				{19204.934,797.924,10.000,89.750},
				{19281.597,766.633,10.000,89.790},
				{19355.132,735.342,10.000,89.830},
				{19425.537,704.051,10.000,89.860},
				{19492.813,672.759,10.000,89.880},
				{19556.959,641.468,10.000,89.910},
				{19617.977,610.177,10.000,89.920},
				{19675.866,578.886,10.000,89.940},
				{19730.625,547.595,10.000,89.950},
				{19782.256,516.304,10.000,89.960},
				{19830.757,485.013,10.000,89.970},
				{19876.129,453.721,10.000,89.980},
				{19918.372,422.430,10.000,89.980},
				{19957.486,391.139,10.000,89.990},
				{19993.471,359.848,10.000,89.990},
				{20026.326,328.557,10.000,89.990},
				{20056.053,297.266,10.000,89.990},
				{20082.650,265.975,10.000,89.990},
				{20106.119,234.684,10.000,89.990},
				{20126.458,203.392,10.000,89.990},
				{20143.668,172.101,10.000,89.990},
				{20157.749,140.810,10.000,89.990},
				{20168.701,109.519,10.000,89.990},
				{20176.524,78.228,10.000,89.990}		};

}