package frc.team2890.paths;

import frc.team319.models.SrxMotionProfile;
import frc.team319.models.SrxTrajectory;

public class turn2 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (6.67,1.67,45.00)
	// (13.33,5.83,90.00)
	
	public turn2() {
		this(false);
	}
			
    public turn2(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.013,0.270,10.000},
				{0.067,0.539,10.000},
				{0.189,1.213,10.000},
				{0.404,2.158,10.000},
				{0.742,3.373,10.000},
				{1.228,4.861,10.000},
				{1.890,6.623,10.000},
				{2.756,8.662,10.000},
				{3.855,10.983,10.000},
				{5.200,13.454,10.000},
				{6.794,15.942,10.000},
				{8.639,18.452,10.000},
				{10.738,20.986,10.000},
				{13.093,23.547,10.000},
				{15.706,26.138,10.000},
				{18.583,28.762,10.000},
				{21.725,31.423,10.000},
				{25.137,34.122,10.000},
				{28.823,36.863,10.000},
				{32.788,39.649,10.000},
				{37.037,42.482,10.000},
				{41.573,45.364,10.000},
				{46.403,48.298,10.000},
				{51.531,51.287,10.000},
				{56.965,54.332,10.000},
				{62.708,57.436,10.000},
				{68.768,60.602,10.000},
				{75.151,63.830,10.000},
				{81.864,67.124,10.000},
				{88.912,70.484,10.000},
				{96.303,73.913,10.000},
				{104.045,77.413,10.000},
				{112.143,80.984,10.000},
				{120.606,84.629,10.000},
				{129.441,88.349,10.000},
				{138.655,92.145,10.000},
				{148.257,96.018,10.000},
				{158.254,99.970,10.000},
				{168.654,104.001,10.000},
				{179.465,108.112,10.000},
				{190.696,112.303,10.000},
				{202.353,116.576,10.000},
				{214.446,120.931,10.000},
				{226.983,125.366,10.000},
				{239.971,129.883,10.000},
				{253.420,134.481,10.000},
				{267.335,139.159,10.000},
				{281.727,143.915,10.000},
				{296.602,148.748,10.000},
				{311.968,153.657,10.000},
				{327.831,158.638,10.000},
				{344.200,163.689,10.000},
				{361.081,168.805,10.000},
				{378.479,173.982,10.000},
				{396.401,179.216,10.000},
				{414.851,184.501,10.000},
				{433.833,189.828,10.000},
				{453.353,195.192,10.000},
				{473.411,200.583,10.000},
				{494.010,205.992,10.000},
				{515.151,211.407,10.000},
				{536.833,216.818,10.000},
				{559.054,222.212,10.000},
				{581.811,227.574,10.000},
				{605.100,232.891,10.000},
				{628.915,238.147,10.000},
				{653.248,243.326,10.000},
				{678.089,248.411,10.000},
				{703.427,253.385,10.000},
				{729.250,258.231,10.000},
				{755.544,262.932,10.000},
				{782.291,267.472,10.000},
				{809.474,271.833,10.000},
				{837.074,276.002,10.000},
				{865.071,279.964,10.000},
				{893.441,283.708,10.000},
				{922.164,287.222,10.000},
				{951.213,290.498,10.000},
				{980.566,293.529,10.000},
				{1010.198,296.313,10.000},
				{1040.082,298.847,10.000},
				{1070.196,301.133,10.000},
				{1100.513,303.173,10.000},
				{1131.010,304.973,10.000},
				{1161.664,306.541,10.000},
				{1192.453,307.886,10.000},
				{1223.355,309.019,10.000},
				{1254.350,309.953,10.000},
				{1285.420,310.701,10.000},
				{1316.548,311.278,10.000},
				{1347.718,311.699,10.000},
				{1378.916,311.979,10.000},
				{1410.129,312.132,10.000},
				{1441.346,312.174,10.000},
				{1472.558,312.119,10.000},
				{1503.756,311.980,10.000},
				{1534.933,311.771,10.000},
				{1566.084,311.503,10.000},
				{1597.202,311.187,10.000},
				{1628.286,310.834,10.000},
				{1659.331,310.453,10.000},
				{1690.336,310.051,10.000},
				{1721.300,309.635,10.000},
				{1752.221,309.211,10.000},
				{1783.099,308.784,10.000},
				{1813.935,308.357,10.000},
				{1844.728,307.935,10.000},
				{1875.480,307.518,10.000},
				{1906.191,307.108,10.000},
				{1936.861,306.705,10.000},
				{1967.492,306.310,10.000},
				{1998.084,305.920,10.000},
				{2028.638,305.535,10.000},
				{2059.153,305.153,10.000},
				{2089.630,304.769,10.000},
				{2120.068,304.381,10.000},
				{2150.467,303.985,10.000},
				{2180.824,303.575,10.000},
				{2211.139,303.147,10.000},
				{2241.408,302.694,10.000},
				{2271.629,302.209,10.000},
				{2301.798,301.685,10.000},
				{2331.909,301.115,10.000},
				{2361.958,300.488,10.000},
				{2391.937,299.795,10.000},
				{2421.840,299.025,10.000},
				{2451.657,298.167,10.000},
				{2481.377,297.206,10.000},
				{2510.990,296.128,10.000},
				{2540.482,294.917,10.000},
				{2569.837,293.556,10.000},
				{2599.040,292.024,10.000},
				{2628.070,290.298,10.000},
				{2656.905,288.356,10.000},
				{2685.522,286.168,10.000},
				{2713.892,283.704,10.000},
				{2741.974,280.813,10.000},
				{2769.709,277.351,10.000},
				{2797.038,273.294,10.000},
				{2823.900,268.617,10.000},
				{2850.229,263.291,10.000},
				{2875.958,257.287,10.000},
				{2901.015,250.576,10.000},
				{2925.324,243.088,10.000},
				{2948.795,234.704,10.000},
				{2971.340,225.450,10.000},
				{2992.880,215.404,10.000},
				{3013.335,204.551,10.000},
				{3032.623,192.883,10.000},
				{3050.664,180.408,10.000},
				{3067.379,167.148,10.000},
				{3082.694,153.149,10.000},
				{3096.544,138.506,10.000},
				{3108.881,123.369,10.000},
				{3119.669,107.879,10.000},
				{3128.887,92.177,10.000},
				{3136.532,76.450,10.000},
				{3142.626,60.936,10.000},
				{3147.218,45.922,10.000},
				{3150.392,31.738,10.000},
				{3152.266,18.741,10.000},
				{3152.995,7.295,10.000},
				{3153.221,2.256,10.000},
				{3154.183,9.620,10.000},
				{3155.642,14.589,10.000},
				{3157.347,17.059,10.000},
				{3159.052,17.045,10.000},
				{3160.520,14.679,10.000},
				{3161.539,10.193,10.000},
				{3161.929,3.895,10.000},
				{3162.315,3.862,10.000},
				{3163.586,12.710,10.000},
				{3165.816,22.296,10.000},
				{3169.045,32.296,10.000},
				{3173.288,42.432,10.000},
				{3178.536,52.476,10.000},
				{3184.761,62.248,10.000},
				{3191.922,71.617,10.000},
				{3199.971,80.488,10.000},
				{3208.852,88.804,10.000},
				{3218.505,96.531,10.000},
				{3228.870,103.657,10.000},
				{3239.889,110.187,10.000},
				{3251.503,116.136,10.000},
				{3263.655,121.526,10.000},
				{3276.294,126.385,10.000},
				{3289.368,130.743,10.000},
				{3302.831,134.631,10.000},
				{3316.639,138.081,10.000},
				{3330.752,141.124,10.000},
				{3345.131,143.790,10.000},
				{3359.742,146.108,10.000},
				{3374.552,148.103,10.000},
				{3389.532,149.802,10.000},
				{3404.655,151.226,10.000},
				{3419.895,152.398,10.000},
				{3435.228,153.337,10.000},
				{3450.634,154.061,10.000},
				{3466.093,154.587,10.000},
				{3481.586,154.930,10.000},
				{3497.097,155.104,10.000},
				{3512.609,155.122,10.000},
				{3528.108,154.996,10.000},
				{3543.582,154.736,10.000},
				{3559.017,154.351,10.000},
				{3574.402,153.852,10.000},
				{3589.727,153.245,10.000},
				{3604.981,152.539,10.000},
				{3620.155,151.741,10.000},
				{3635.241,150.856,10.000},
				{3650.230,149.891,10.000},
				{3665.115,148.851,10.000},
				{3679.889,147.740,10.000},
				{3694.545,146.563,10.000},
				{3709.077,145.324,10.000},
				{3723.480,144.028,10.000},
				{3737.748,142.677,10.000},
				{3751.875,141.275,10.000},
				{3765.858,139.824,10.000},
				{3779.691,138.328,10.000},
				{3793.370,136.789,10.000},
				{3806.891,135.210,10.000},
				{3820.250,133.592,10.000},
				{3833.443,131.937,10.000},
				{3846.468,130.248,10.000},
				{3859.321,128.526,10.000},
				{3871.998,126.773,10.000},
				{3884.497,124.990,10.000},
				{3896.815,123.178,10.000},
				{3908.949,121.340,10.000},
				{3920.897,119.476,10.000},
				{3932.655,117.587,10.000},
				{3944.223,115.674,10.000},
				{3955.596,113.738,10.000},
				{3966.775,111.781,10.000},
				{3977.755,109.803,10.000},
				{3988.535,107.805,10.000},
				{3999.114,105.787,10.000},
				{4009.489,103.751,10.000},
				{4019.659,101.697,10.000},
				{4029.621,99.625,10.000},
				{4039.375,97.537,10.000},
				{4048.918,95.432,10.000},
				{4058.250,93.312,10.000},
				{4067.367,91.177,10.000},
				{4076.270,89.027,10.000},
				{4084.956,86.863,10.000},
				{4093.425,84.686,10.000},
				{4101.674,82.495,10.000},
				{4109.704,80.291,10.000},
				{4117.511,78.075,10.000},
				{4125.096,75.846,10.000},
				{4132.456,73.606,10.000},
				{4139.592,71.355,10.000},
				{4146.501,69.093,10.000},
				{4153.183,66.820,10.000},
				{4159.637,64.537,10.000},
				{4165.861,62.244,10.000},
				{4171.855,59.942,10.000},
				{4177.618,57.630,10.000},
				{4183.149,55.310,10.000},
				{4188.447,52.981,10.000},
				{4193.512,50.644,10.000},
				{4198.342,48.299,10.000},
				{4202.936,45.946,10.000},
				{4207.295,43.587,10.000},
				{4211.417,41.221,10.000},
				{4215.302,38.848,10.000},
				{4218.949,36.469,10.000},
				{4222.357,34.085,10.000},
				{4225.527,31.695,10.000},
				{4228.457,29.301,10.000},
				{4231.147,26.901,10.000},
				{4233.597,24.498,10.000},
				{4235.806,22.090,10.000},
				{4237.774,19.679,10.000},
				{4239.500,17.265,10.000},
				{4240.985,14.848,10.000},
				{4242.228,12.429,10.000},
				{4243.234,10.058,10.000},
				{4244.021,7.870,10.000},
				{4244.616,5.950,10.000},
				{4245.046,4.300,10.000},
				{4245.337,2.918,10.000},
				{4245.518,1.805,10.000},
				{4245.614,0.962,10.000},
				{4245.653,0.389,10.000},
				{4245.662,0.085,10.000},
				{4245.662,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.013,0.270,10.000},
				{0.067,0.539,10.000},
				{0.189,1.213,10.000},
				{0.404,2.155,10.000},
				{0.741,3.366,10.000},
				{1.225,4.843,10.000},
				{1.883,6.585,10.000},
				{2.742,8.588,10.000},
				{3.827,10.850,10.000},
				{5.150,13.231,10.000},
				{6.710,15.594,10.000},
				{8.503,17.936,10.000},
				{10.529,20.254,10.000},
				{12.783,22.545,10.000},
				{15.264,24.805,10.000},
				{17.967,27.033,10.000},
				{20.889,29.224,10.000},
				{24.027,31.376,10.000},
				{27.376,33.487,10.000},
				{30.931,35.553,10.000},
				{34.688,37.572,10.000},
				{38.642,39.541,10.000},
				{42.788,41.459,10.000},
				{47.120,43.322,10.000},
				{51.633,45.128,10.000},
				{56.321,46.876,10.000},
				{61.177,48.562,10.000},
				{66.196,50.185,10.000},
				{71.370,51.744,10.000},
				{76.693,53.235,10.000},
				{82.159,54.658,10.000},
				{87.760,56.010,10.000},
				{93.489,57.290,10.000},
				{99.339,58.497,10.000},
				{105.302,59.629,10.000},
				{111.370,60.685,10.000},
				{117.536,61.663,10.000},
				{123.793,62.563,10.000},
				{130.131,63.384,10.000},
				{136.544,64.125,10.000},
				{143.022,64.784,10.000},
				{149.558,65.363,10.000},
				{156.144,65.861,10.000},
				{162.772,66.276,10.000},
				{169.433,66.611,10.000},
				{176.120,66.865,10.000},
				{182.824,67.039,10.000},
				{189.537,67.135,10.000},
				{196.252,67.153,10.000},
				{202.962,67.096,10.000},
				{209.659,66.967,10.000},
				{216.335,66.768,10.000},
				{222.986,66.503,10.000},
				{229.604,66.177,10.000},
				{236.183,65.795,10.000},
				{242.719,65.362,10.000},
				{249.208,64.886,10.000},
				{255.645,64.374,10.000},
				{262.029,63.835,10.000},
				{268.357,63.278,10.000},
				{274.628,62.714,10.000},
				{280.843,62.154,10.000},
				{287.005,61.612,10.000},
				{293.115,61.101,10.000},
				{299.178,60.636,10.000},
				{305.202,60.232,10.000},
				{311.192,59.905,10.000},
				{317.159,59.671,10.000},
				{323.114,59.549,10.000},
				{329.069,59.554,10.000},
				{335.040,59.704,10.000},
				{341.041,60.016,10.000},
				{347.092,60.506,10.000},
				{353.211,61.189,10.000},
				{359.419,62.078,10.000},
				{365.737,63.187,10.000},
				{372.190,64.524,10.000},
				{378.800,66.100,10.000},
				{385.592,67.920,10.000},
				{392.590,69.987,10.000},
				{399.821,72.305,10.000},
				{407.308,74.871,10.000},
				{415.076,77.683,10.000},
				{423.150,80.734,10.000},
				{431.552,84.018,10.000},
				{440.304,87.525,10.000},
				{449.428,91.244,10.000},
				{458.945,95.162,10.000},
				{468.871,99.265,10.000},
				{479.225,103.540,10.000},
				{490.022,107.971,10.000},
				{501.277,112.543,10.000},
				{513.001,117.242,10.000},
				{525.206,122.052,10.000},
				{537.902,126.959,10.000},
				{551.097,131.949,10.000},
				{564.798,137.011,10.000},
				{579.011,142.130,10.000},
				{593.741,147.298,10.000},
				{608.991,152.503,10.000},
				{624.764,157.736,10.000},
				{641.063,162.990,10.000},
				{657.889,168.258,10.000},
				{675.243,173.534,10.000},
				{693.124,178.813,10.000},
				{711.533,184.091,10.000},
				{730.469,189.365,10.000},
				{749.933,194.634,10.000},
				{769.923,199.896,10.000},
				{790.438,205.151,10.000},
				{811.477,210.398,10.000},
				{833.041,215.639,10.000},
				{855.129,220.876,10.000},
				{877.740,226.110,10.000},
				{900.874,231.346,10.000},
				{924.533,236.585,10.000},
				{948.716,241.834,10.000},
				{973.426,247.095,10.000},
				{998.663,252.375,10.000},
				{1024.431,257.680,10.000},
				{1050.733,263.017,10.000},
				{1077.572,268.392,10.000},
				{1104.954,273.815,10.000},
				{1132.883,279.293,10.000},
				{1161.367,284.838,10.000},
				{1190.413,290.459,10.000},
				{1220.030,296.170,10.000},
				{1250.228,301.982,10.000},
				{1281.019,307.912,10.000},
				{1312.417,313.974,10.000},
				{1344.435,320.187,10.000},
				{1377.092,326.571,10.000},
				{1410.407,333.148,10.000},
				{1444.401,339.942,10.000},
				{1479.100,346.982,10.000},
				{1514.529,354.297,10.000},
				{1550.706,361.770,10.000},
				{1587.634,369.274,10.000},
				{1625.317,376.835,10.000},
				{1663.765,384.477,10.000},
				{1702.988,392.228,10.000},
				{1743.000,400.118,10.000},
				{1783.817,408.177,10.000},
				{1825.454,416.372,10.000},
				{1867.910,424.554,10.000},
				{1911.190,432.798,10.000},
				{1955.319,441.295,10.000},
				{2000.325,450.059,10.000},
				{2046.235,459.099,10.000},
				{2093.076,468.407,10.000},
				{2140.872,477.960,10.000},
				{2189.643,487.713,10.000},
				{2239.410,497.671,10.000},
				{2290.205,507.953,10.000},
				{2342.064,518.588,10.000},
				{2395.008,529.436,10.000},
				{2449.039,540.308,10.000},
				{2504.135,550.967,10.000},
				{2560.248,561.125,10.000},
				{2617.293,570.454,10.000},
				{2675.153,578.597,10.000},
				{2733.672,585.188,10.000},
				{2792.660,589.885,10.000},
				{2851.900,592.396,10.000},
				{2911.151,592.513,10.000},
				{2970.164,590.132,10.000},
				{3028.691,585.268,10.000},
				{3086.496,578.052,10.000},
				{3143.368,568.717,10.000},
				{3199.125,557.570,10.000},
				{3253.621,544.965,10.000},
				{3306.748,531.268,10.000},
				{3358.432,516.834,10.000},
				{3408.630,501.986,10.000},
				{3457.330,487.001,10.000},
				{3504.541,472.109,10.000},
				{3550.290,457.487,10.000},
				{3594.617,443.270,10.000},
				{3637.572,429.549,10.000},
				{3679.210,416.384,10.000},
				{3719.591,403.807,10.000},
				{3758.774,391.830,10.000},
				{3796.819,380.449,10.000},
				{3833.784,369.650,10.000},
				{3869.725,359.409,10.000},
				{3904.695,349.700,10.000},
				{3938.744,340.491,10.000},
				{3971.919,331.752,10.000},
				{4004.264,323.450,10.000},
				{4035.820,315.556,10.000},
				{4066.623,308.038,10.000},
				{4096.710,300.869,10.000},
				{4126.113,294.023,10.000},
				{4154.860,287.473,10.000},
				{4182.980,281.197,10.000},
				{4210.497,275.174,10.000},
				{4237.435,269.383,10.000},
				{4263.816,263.807,10.000},
				{4289.659,258.430,10.000},
				{4314.983,253.235,10.000},
				{4339.803,248.209,10.000},
				{4364.137,243.340,10.000},
				{4387.999,238.614,10.000},
				{4411.401,234.023,10.000},
				{4434.357,229.556,10.000},
				{4456.877,225.204,10.000},
				{4478.973,220.958,10.000},
				{4500.654,216.813,10.000},
				{4521.930,212.759,10.000},
				{4542.809,208.792,10.000},
				{4563.300,204.906,10.000},
				{4583.409,201.095,10.000},
				{4603.145,197.354,10.000},
				{4622.513,193.679,10.000},
				{4641.519,190.066,10.000},
				{4660.170,186.510,10.000},
				{4678.471,183.010,10.000},
				{4696.427,179.560,10.000},
				{4714.043,176.159,10.000},
				{4731.324,172.803,10.000},
				{4748.273,169.490,10.000},
				{4764.894,166.218,10.000},
				{4781.193,162.985,10.000},
				{4797.172,159.788,10.000},
				{4812.834,156.625,10.000},
				{4828.184,153.495,10.000},
				{4843.223,150.397,10.000},
				{4857.956,147.328,10.000},
				{4872.385,144.288,10.000},
				{4886.512,141.274,10.000},
				{4900.341,138.287,10.000},
				{4913.874,135.324,10.000},
				{4927.112,132.385,10.000},
				{4940.059,129.469,10.000},
				{4952.716,126.575,10.000},
				{4965.087,123.701,10.000},
				{4977.171,120.848,10.000},
				{4988.973,118.013,10.000},
				{5000.492,115.198,10.000},
				{5011.732,112.400,10.000},
				{5022.695,109.620,10.000},
				{5033.380,106.857,10.000},
				{5043.791,104.110,10.000},
				{5053.929,101.378,10.000},
				{5063.795,98.661,10.000},
				{5073.391,95.959,10.000},
				{5082.718,93.272,10.000},
				{5091.778,90.598,10.000},
				{5100.572,87.937,10.000},
				{5109.101,85.289,10.000},
				{5117.366,82.654,10.000},
				{5125.369,80.030,10.000},
				{5133.111,77.418,10.000},
				{5140.593,74.818,10.000},
				{5147.815,72.228,10.000},
				{5154.780,69.650,10.000},
				{5161.488,67.081,10.000},
				{5167.941,64.522,10.000},
				{5174.138,61.973,10.000},
				{5180.081,59.433,10.000},
				{5185.771,56.901,10.000},
				{5191.209,54.379,10.000},
				{5196.396,51.864,10.000},
				{5201.331,49.357,10.000},
				{5206.017,46.858,10.000},
				{5210.454,44.365,10.000},
				{5214.642,41.880,10.000},
				{5218.582,39.401,10.000},
				{5222.274,36.928,10.000},
				{5225.720,34.460,10.000},
				{5228.920,31.998,10.000},
				{5231.874,29.541,10.000},
				{5234.583,27.089,10.000},
				{5237.047,24.641,10.000},
				{5239.267,22.197,10.000},
				{5241.243,19.756,10.000},
				{5242.975,17.318,10.000},
				{5244.463,14.884,10.000},
				{5245.708,12.451,10.000},
				{5246.715,10.071,10.000},
				{5247.503,7.877,10.000},
				{5248.098,5.954,10.000},
				{5248.528,4.301,10.000},
				{5248.820,2.918,10.000},
				{5249.001,1.806,10.000},
				{5249.097,0.962,10.000},
				{5249.136,0.389,10.000},
				{5249.144,0.085,10.000},
				{5249.144,0.000,10.000}
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