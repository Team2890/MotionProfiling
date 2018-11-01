package frc.team2890.paths;

import frc.team319.models.SrxMotionProfile;
import frc.team319.models.SrxTrajectory;

public class SameSideScalePart5 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (3.92,0.00,0.00)
	
	public SameSideScalePart5() {
		this(false);
	}
			
    public SameSideScalePart5(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.014,0.279,10.000},
				{0.070,0.557,10.000},
				{0.195,1.254,10.000},
				{0.418,2.229,10.000},
				{0.766,3.484,10.000},
				{1.268,5.016,10.000},
				{1.951,6.828,10.000},
				{2.829,8.779,10.000},
				{3.902,10.729,10.000},
				{5.170,12.680,10.000},
				{6.633,14.631,10.000},
				{8.291,16.582,10.000},
				{10.144,18.533,10.000},
				{12.193,20.483,10.000},
				{14.436,22.434,10.000},
				{16.874,24.385,10.000},
				{19.508,26.336,10.000},
				{22.337,28.287,10.000},
				{25.360,30.238,10.000},
				{28.579,32.188,10.000},
				{31.993,34.139,10.000},
				{35.602,36.090,10.000},
				{39.406,38.041,10.000},
				{43.405,39.992,10.000},
				{47.600,41.942,10.000},
				{51.989,43.893,10.000},
				{56.573,45.844,10.000},
				{61.353,47.795,10.000},
				{66.327,49.746,10.000},
				{71.497,51.696,10.000},
				{76.862,53.647,10.000},
				{82.422,55.598,10.000},
				{88.176,57.549,10.000},
				{94.126,59.500,10.000},
				{100.271,61.450,10.000},
				{106.612,63.401,10.000},
				{113.147,65.352,10.000},
				{119.877,67.303,10.000},
				{126.802,69.254,10.000},
				{133.923,71.204,10.000},
				{141.238,73.155,10.000},
				{148.749,75.106,10.000},
				{156.455,77.057,10.000},
				{164.355,79.008,10.000},
				{172.451,80.958,10.000},
				{180.742,82.909,10.000},
				{189.228,84.860,10.000},
				{197.909,86.811,10.000},
				{206.786,88.762,10.000},
				{215.857,90.713,10.000},
				{225.123,92.663,10.000},
				{234.585,94.614,10.000},
				{244.241,96.565,10.000},
				{254.093,98.516,10.000},
				{264.139,100.467,10.000},
				{274.381,102.417,10.000},
				{284.818,104.368,10.000},
				{295.450,106.319,10.000},
				{306.277,108.270,10.000},
				{317.299,110.221,10.000},
				{328.516,112.171,10.000},
				{339.928,114.122,10.000},
				{351.535,116.073,10.000},
				{363.338,118.024,10.000},
				{375.335,119.975,10.000},
				{387.528,121.925,10.000},
				{399.915,123.876,10.000},
				{412.498,125.827,10.000},
				{425.276,127.778,10.000},
				{438.249,129.729,10.000},
				{451.417,131.679,10.000},
				{464.780,133.630,10.000},
				{478.338,135.581,10.000},
				{492.091,137.532,10.000},
				{506.039,139.483,10.000},
				{520.169,141.294,10.000},
				{534.451,142.827,10.000},
				{548.859,144.081,10.000},
				{563.365,145.056,10.000},
				{577.940,145.753,10.000},
				{592.558,146.171,10.000},
				{607.189,146.311,10.000},
				{621.820,146.311,10.000},
				{636.451,146.311,10.000},
				{651.082,146.311,10.000},
				{665.713,146.311,10.000},
				{680.344,146.311,10.000},
				{694.975,146.311,10.000},
				{709.606,146.311,10.000},
				{724.237,146.311,10.000},
				{738.868,146.311,10.000},
				{753.499,146.311,10.000},
				{768.130,146.311,10.000},
				{782.761,146.311,10.000},
				{797.392,146.311,10.000},
				{812.023,146.311,10.000},
				{826.654,146.311,10.000},
				{841.285,146.311,10.000},
				{855.916,146.311,10.000},
				{870.547,146.311,10.000},
				{885.179,146.311,10.000},
				{899.810,146.311,10.000},
				{914.441,146.311,10.000},
				{929.072,146.311,10.000},
				{943.703,146.311,10.000},
				{958.334,146.311,10.000},
				{972.965,146.311,10.000},
				{987.596,146.311,10.000},
				{1002.227,146.311,10.000},
				{1016.858,146.311,10.000},
				{1031.489,146.311,10.000},
				{1046.120,146.311,10.000},
				{1060.751,146.311,10.000},
				{1075.382,146.311,10.000},
				{1090.013,146.311,10.000},
				{1104.644,146.311,10.000},
				{1119.275,146.311,10.000},
				{1133.906,146.311,10.000},
				{1148.537,146.311,10.000},
				{1163.168,146.311,10.000},
				{1177.800,146.311,10.000},
				{1192.431,146.311,10.000},
				{1207.062,146.311,10.000},
				{1221.693,146.311,10.000},
				{1236.324,146.311,10.000},
				{1250.955,146.311,10.000},
				{1265.586,146.311,10.000},
				{1280.217,146.311,10.000},
				{1294.848,146.311,10.000},
				{1309.479,146.311,10.000},
				{1324.104,146.249,10.000},
				{1338.702,145.985,10.000},
				{1353.247,145.443,10.000},
				{1367.709,144.623,10.000},
				{1382.061,143.524,10.000},
				{1396.276,142.146,10.000},
				{1410.325,140.489,10.000},
				{1424.186,138.616,10.000},
				{1437.853,136.665,10.000},
				{1451.324,134.714,10.000},
				{1464.601,132.763,10.000},
				{1477.682,130.812,10.000},
				{1490.568,128.862,10.000},
				{1503.259,126.911,10.000},
				{1515.755,124.960,10.000},
				{1528.056,123.009,10.000},
				{1540.162,121.058,10.000},
				{1552.073,119.108,10.000},
				{1563.788,117.157,10.000},
				{1575.309,115.206,10.000},
				{1586.634,113.255,10.000},
				{1597.765,111.304,10.000},
				{1608.700,109.354,10.000},
				{1619.441,107.403,10.000},
				{1629.986,105.452,10.000},
				{1640.336,103.501,10.000},
				{1650.491,101.550,10.000},
				{1660.451,99.600,10.000},
				{1670.216,97.649,10.000},
				{1679.785,95.698,10.000},
				{1689.160,93.747,10.000},
				{1698.340,91.796,10.000},
				{1707.324,89.845,10.000},
				{1716.114,87.895,10.000},
				{1724.708,85.944,10.000},
				{1733.108,83.993,10.000},
				{1741.312,82.042,10.000},
				{1749.321,80.091,10.000},
				{1757.135,78.141,10.000},
				{1764.754,76.190,10.000},
				{1772.178,74.239,10.000},
				{1779.407,72.288,10.000},
				{1786.440,70.337,10.000},
				{1793.279,68.387,10.000},
				{1799.923,66.436,10.000},
				{1806.371,64.485,10.000},
				{1812.625,62.534,10.000},
				{1818.683,60.583,10.000},
				{1824.546,58.633,10.000},
				{1830.214,56.682,10.000},
				{1835.687,54.731,10.000},
				{1840.965,52.780,10.000},
				{1846.048,50.829,10.000},
				{1850.936,48.879,10.000},
				{1855.629,46.928,10.000},
				{1860.127,44.977,10.000},
				{1864.429,43.026,10.000},
				{1868.537,41.075,10.000},
				{1872.449,39.125,10.000},
				{1876.167,37.174,10.000},
				{1879.689,35.223,10.000},
				{1883.016,33.272,10.000},
				{1886.148,31.321,10.000},
				{1889.085,29.370,10.000},
				{1891.827,27.420,10.000},
				{1894.374,25.469,10.000},
				{1896.726,23.518,10.000},
				{1898.883,21.567,10.000},
				{1900.844,19.616,10.000},
				{1902.611,17.666,10.000},
				{1904.182,15.715,10.000},
				{1905.559,13.764,10.000},
				{1906.740,11.813,10.000},
				{1907.726,9.862,10.000},
				{1908.518,7.912,10.000},
				{1909.120,6.023,10.000},
				{1909.553,4.335,10.000},
				{1909.846,2.926,10.000},
				{1910.026,1.796,10.000},
				{1910.120,0.944,10.000},
				{1910.157,0.372,10.000},
				{1910.165,0.077,10.000},
				{1910.165,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.014,0.279,10.000},
				{0.070,0.557,10.000},
				{0.195,1.254,10.000},
				{0.418,2.229,10.000},
				{0.766,3.484,10.000},
				{1.268,5.016,10.000},
				{1.951,6.828,10.000},
				{2.829,8.779,10.000},
				{3.902,10.729,10.000},
				{5.170,12.680,10.000},
				{6.633,14.631,10.000},
				{8.291,16.582,10.000},
				{10.144,18.533,10.000},
				{12.193,20.483,10.000},
				{14.436,22.434,10.000},
				{16.874,24.385,10.000},
				{19.508,26.336,10.000},
				{22.337,28.287,10.000},
				{25.360,30.238,10.000},
				{28.579,32.188,10.000},
				{31.993,34.139,10.000},
				{35.602,36.090,10.000},
				{39.406,38.041,10.000},
				{43.405,39.992,10.000},
				{47.600,41.942,10.000},
				{51.989,43.893,10.000},
				{56.573,45.844,10.000},
				{61.353,47.795,10.000},
				{66.327,49.746,10.000},
				{71.497,51.696,10.000},
				{76.862,53.647,10.000},
				{82.422,55.598,10.000},
				{88.176,57.549,10.000},
				{94.126,59.500,10.000},
				{100.271,61.450,10.000},
				{106.612,63.401,10.000},
				{113.147,65.352,10.000},
				{119.877,67.303,10.000},
				{126.802,69.254,10.000},
				{133.923,71.204,10.000},
				{141.238,73.155,10.000},
				{148.749,75.106,10.000},
				{156.455,77.057,10.000},
				{164.355,79.008,10.000},
				{172.451,80.958,10.000},
				{180.742,82.909,10.000},
				{189.228,84.860,10.000},
				{197.909,86.811,10.000},
				{206.786,88.762,10.000},
				{215.857,90.713,10.000},
				{225.123,92.663,10.000},
				{234.585,94.614,10.000},
				{244.241,96.565,10.000},
				{254.093,98.516,10.000},
				{264.139,100.467,10.000},
				{274.381,102.417,10.000},
				{284.818,104.368,10.000},
				{295.450,106.319,10.000},
				{306.277,108.270,10.000},
				{317.299,110.221,10.000},
				{328.516,112.171,10.000},
				{339.928,114.122,10.000},
				{351.535,116.073,10.000},
				{363.338,118.024,10.000},
				{375.335,119.975,10.000},
				{387.528,121.925,10.000},
				{399.915,123.876,10.000},
				{412.498,125.827,10.000},
				{425.276,127.778,10.000},
				{438.249,129.729,10.000},
				{451.417,131.679,10.000},
				{464.780,133.630,10.000},
				{478.338,135.581,10.000},
				{492.091,137.532,10.000},
				{506.039,139.483,10.000},
				{520.169,141.294,10.000},
				{534.451,142.827,10.000},
				{548.859,144.081,10.000},
				{563.365,145.056,10.000},
				{577.940,145.753,10.000},
				{592.558,146.171,10.000},
				{607.189,146.311,10.000},
				{621.820,146.311,10.000},
				{636.451,146.311,10.000},
				{651.082,146.311,10.000},
				{665.713,146.311,10.000},
				{680.344,146.311,10.000},
				{694.975,146.311,10.000},
				{709.606,146.311,10.000},
				{724.237,146.311,10.000},
				{738.868,146.311,10.000},
				{753.499,146.311,10.000},
				{768.130,146.311,10.000},
				{782.761,146.311,10.000},
				{797.392,146.311,10.000},
				{812.023,146.311,10.000},
				{826.654,146.311,10.000},
				{841.285,146.311,10.000},
				{855.916,146.311,10.000},
				{870.547,146.311,10.000},
				{885.179,146.311,10.000},
				{899.810,146.311,10.000},
				{914.441,146.311,10.000},
				{929.072,146.311,10.000},
				{943.703,146.311,10.000},
				{958.334,146.311,10.000},
				{972.965,146.311,10.000},
				{987.596,146.311,10.000},
				{1002.227,146.311,10.000},
				{1016.858,146.311,10.000},
				{1031.489,146.311,10.000},
				{1046.120,146.311,10.000},
				{1060.751,146.311,10.000},
				{1075.382,146.311,10.000},
				{1090.013,146.311,10.000},
				{1104.644,146.311,10.000},
				{1119.275,146.311,10.000},
				{1133.906,146.311,10.000},
				{1148.537,146.311,10.000},
				{1163.168,146.311,10.000},
				{1177.800,146.311,10.000},
				{1192.431,146.311,10.000},
				{1207.062,146.311,10.000},
				{1221.693,146.311,10.000},
				{1236.324,146.311,10.000},
				{1250.955,146.311,10.000},
				{1265.586,146.311,10.000},
				{1280.217,146.311,10.000},
				{1294.848,146.311,10.000},
				{1309.479,146.311,10.000},
				{1324.104,146.249,10.000},
				{1338.702,145.985,10.000},
				{1353.247,145.443,10.000},
				{1367.709,144.623,10.000},
				{1382.061,143.524,10.000},
				{1396.276,142.146,10.000},
				{1410.325,140.489,10.000},
				{1424.186,138.616,10.000},
				{1437.853,136.665,10.000},
				{1451.324,134.714,10.000},
				{1464.601,132.763,10.000},
				{1477.682,130.812,10.000},
				{1490.568,128.862,10.000},
				{1503.259,126.911,10.000},
				{1515.755,124.960,10.000},
				{1528.056,123.009,10.000},
				{1540.162,121.058,10.000},
				{1552.073,119.108,10.000},
				{1563.788,117.157,10.000},
				{1575.309,115.206,10.000},
				{1586.634,113.255,10.000},
				{1597.765,111.304,10.000},
				{1608.700,109.354,10.000},
				{1619.441,107.403,10.000},
				{1629.986,105.452,10.000},
				{1640.336,103.501,10.000},
				{1650.491,101.550,10.000},
				{1660.451,99.600,10.000},
				{1670.216,97.649,10.000},
				{1679.785,95.698,10.000},
				{1689.160,93.747,10.000},
				{1698.340,91.796,10.000},
				{1707.324,89.845,10.000},
				{1716.114,87.895,10.000},
				{1724.708,85.944,10.000},
				{1733.108,83.993,10.000},
				{1741.312,82.042,10.000},
				{1749.321,80.091,10.000},
				{1757.135,78.141,10.000},
				{1764.754,76.190,10.000},
				{1772.178,74.239,10.000},
				{1779.407,72.288,10.000},
				{1786.440,70.337,10.000},
				{1793.279,68.387,10.000},
				{1799.923,66.436,10.000},
				{1806.371,64.485,10.000},
				{1812.625,62.534,10.000},
				{1818.683,60.583,10.000},
				{1824.546,58.633,10.000},
				{1830.214,56.682,10.000},
				{1835.687,54.731,10.000},
				{1840.965,52.780,10.000},
				{1846.048,50.829,10.000},
				{1850.936,48.879,10.000},
				{1855.629,46.928,10.000},
				{1860.127,44.977,10.000},
				{1864.429,43.026,10.000},
				{1868.537,41.075,10.000},
				{1872.449,39.125,10.000},
				{1876.167,37.174,10.000},
				{1879.689,35.223,10.000},
				{1883.016,33.272,10.000},
				{1886.148,31.321,10.000},
				{1889.085,29.370,10.000},
				{1891.827,27.420,10.000},
				{1894.374,25.469,10.000},
				{1896.726,23.518,10.000},
				{1898.883,21.567,10.000},
				{1900.844,19.616,10.000},
				{1902.611,17.666,10.000},
				{1904.182,15.715,10.000},
				{1905.559,13.764,10.000},
				{1906.740,11.813,10.000},
				{1907.726,9.862,10.000},
				{1908.518,7.912,10.000},
				{1909.120,6.023,10.000},
				{1909.553,4.335,10.000},
				{1909.846,2.926,10.000},
				{1910.026,1.796,10.000},
				{1910.120,0.944,10.000},
				{1910.157,0.372,10.000},
				{1910.165,0.077,10.000},
				{1910.165,0.000,10.000}
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