package gals;

public interface ScannerConstants {
	int[] SCANNER_TABLE_INDEXES = { 0, 86, 90, 281, 474, 474, 474, 474, 474,
			474, 474, 485, 486, 499, 500, 500, 502, 502, 503, 565, 629, 629,
			629, 629, 629, 629, 629, 641, 834, 846, 858, 858, 858, 858, 858,
			922, 986, 1048, 1060, 1253, 1446, 1456, 1466, 1528, 1538, 1548,
			1741, 1751, 1761 };

	int[][] SCANNER_TABLE = { { 9, 1 }, { 10, 1 }, { 13, 1 }, { 32, 1 },
			{ 35, 2 }, { 39, 3 }, { 40, 4 }, { 41, 5 }, { 42, 6 }, { 43, 7 },
			{ 44, 8 }, { 45, 9 }, { 46, 10 }, { 47, 11 }, { 48, 12 },
			{ 49, 12 }, { 50, 12 }, { 51, 12 }, { 52, 12 }, { 53, 12 },
			{ 54, 12 }, { 55, 12 }, { 56, 12 }, { 57, 12 }, { 58, 13 },
			{ 59, 14 }, { 60, 15 }, { 61, 16 }, { 62, 17 }, { 64, 18 },
			{ 65, 19 }, { 66, 19 }, { 67, 19 }, { 68, 19 }, { 69, 19 },
			{ 70, 19 }, { 71, 19 }, { 72, 19 }, { 73, 19 }, { 74, 19 },
			{ 75, 19 }, { 76, 19 }, { 77, 19 }, { 78, 19 }, { 79, 19 },
			{ 80, 19 }, { 81, 19 }, { 82, 19 }, { 83, 19 }, { 84, 19 },
			{ 85, 19 }, { 86, 19 }, { 87, 19 }, { 88, 19 }, { 89, 19 },
			{ 90, 19 }, { 91, 20 }, { 93, 21 }, { 97, 19 }, { 98, 19 },
			{ 99, 19 }, { 100, 19 }, { 101, 19 }, { 102, 19 }, { 103, 19 },
			{ 104, 19 }, { 105, 19 }, { 106, 19 }, { 107, 19 }, { 108, 19 },
			{ 109, 19 }, { 110, 19 }, { 111, 19 }, { 112, 19 }, { 113, 19 },
			{ 114, 19 }, { 115, 19 }, { 116, 19 }, { 117, 19 }, { 118, 19 },
			{ 119, 19 }, { 120, 19 }, { 121, 19 }, { 122, 19 }, { 123, 22 },
			{ 125, 23 }, { 9, 1 }, { 10, 1 }, { 13, 1 }, { 32, 1 }, { 9, 2 },
			{ 32, 2 }, { 33, 2 }, { 34, 2 }, { 35, 2 }, { 36, 2 }, { 37, 2 },
			{ 38, 2 }, { 39, 2 }, { 40, 2 }, { 41, 2 }, { 42, 2 }, { 43, 2 },
			{ 44, 2 }, { 45, 2 }, { 46, 2 }, { 47, 2 }, { 48, 2 }, { 49, 2 },
			{ 50, 2 }, { 51, 2 }, { 52, 2 }, { 53, 2 }, { 54, 2 }, { 55, 2 },
			{ 56, 2 }, { 57, 2 }, { 58, 2 }, { 59, 2 }, { 60, 2 }, { 61, 2 },
			{ 62, 2 }, { 63, 2 }, { 64, 2 }, { 65, 2 }, { 66, 2 }, { 67, 2 },
			{ 68, 2 }, { 69, 2 }, { 70, 2 }, { 71, 2 }, { 72, 2 }, { 73, 2 },
			{ 74, 2 }, { 75, 2 }, { 76, 2 }, { 77, 2 }, { 78, 2 }, { 79, 2 },
			{ 80, 2 }, { 81, 2 }, { 82, 2 }, { 83, 2 }, { 84, 2 }, { 85, 2 },
			{ 86, 2 }, { 87, 2 }, { 88, 2 }, { 89, 2 }, { 90, 2 }, { 91, 2 },
			{ 92, 2 }, { 93, 2 }, { 94, 2 }, { 95, 2 }, { 96, 2 }, { 97, 2 },
			{ 98, 2 }, { 99, 2 }, { 100, 2 }, { 101, 2 }, { 102, 2 },
			{ 103, 2 }, { 104, 2 }, { 105, 2 }, { 106, 2 }, { 107, 2 },
			{ 108, 2 }, { 109, 2 }, { 110, 2 }, { 111, 2 }, { 112, 2 },
			{ 113, 2 }, { 114, 2 }, { 115, 2 }, { 116, 2 }, { 117, 2 },
			{ 118, 2 }, { 119, 2 }, { 120, 2 }, { 121, 2 }, { 122, 2 },
			{ 123, 2 }, { 124, 2 }, { 125, 2 }, { 126, 2 }, { 161, 2 },
			{ 162, 2 }, { 163, 2 }, { 164, 2 }, { 165, 2 }, { 166, 2 },
			{ 167, 2 }, { 168, 2 }, { 169, 2 }, { 170, 2 }, { 171, 2 },
			{ 172, 2 }, { 173, 2 }, { 174, 2 }, { 175, 2 }, { 176, 2 },
			{ 177, 2 }, { 178, 2 }, { 179, 2 }, { 180, 2 }, { 181, 2 },
			{ 182, 2 }, { 183, 2 }, { 184, 2 }, { 185, 2 }, { 186, 2 },
			{ 187, 2 }, { 188, 2 }, { 189, 2 }, { 190, 2 }, { 191, 2 },
			{ 192, 2 }, { 193, 2 }, { 194, 2 }, { 195, 2 }, { 196, 2 },
			{ 197, 2 }, { 198, 2 }, { 199, 2 }, { 200, 2 }, { 201, 2 },
			{ 202, 2 }, { 203, 2 }, { 204, 2 }, { 205, 2 }, { 206, 2 },
			{ 207, 2 }, { 208, 2 }, { 209, 2 }, { 210, 2 }, { 211, 2 },
			{ 212, 2 }, { 213, 2 }, { 214, 2 }, { 215, 2 }, { 216, 2 },
			{ 217, 2 }, { 218, 2 }, { 219, 2 }, { 220, 2 }, { 221, 2 },
			{ 222, 2 }, { 223, 2 }, { 224, 2 }, { 225, 2 }, { 226, 2 },
			{ 227, 2 }, { 228, 2 }, { 229, 2 }, { 230, 2 }, { 231, 2 },
			{ 232, 2 }, { 233, 2 }, { 234, 2 }, { 235, 2 }, { 236, 2 },
			{ 237, 2 }, { 238, 2 }, { 239, 2 }, { 240, 2 }, { 241, 2 },
			{ 242, 2 }, { 243, 2 }, { 244, 2 }, { 245, 2 }, { 246, 2 },
			{ 247, 2 }, { 248, 2 }, { 249, 2 }, { 250, 2 }, { 251, 2 },
			{ 252, 2 }, { 253, 2 }, { 254, 2 }, { 255, 2 }, { 9, 3 },
			{ 10, 3 }, { 13, 3 }, { 32, 3 }, { 33, 3 }, { 34, 3 }, { 35, 3 },
			{ 36, 3 }, { 37, 3 }, { 38, 3 }, { 39, 24 }, { 40, 3 }, { 41, 3 },
			{ 42, 3 }, { 43, 3 }, { 44, 3 }, { 45, 3 }, { 46, 3 }, { 47, 3 },
			{ 48, 3 }, { 49, 3 }, { 50, 3 }, { 51, 3 }, { 52, 3 }, { 53, 3 },
			{ 54, 3 }, { 55, 3 }, { 56, 3 }, { 57, 3 }, { 58, 3 }, { 59, 3 },
			{ 60, 3 }, { 61, 3 }, { 62, 3 }, { 63, 3 }, { 64, 3 }, { 65, 3 },
			{ 66, 3 }, { 67, 3 }, { 68, 3 }, { 69, 3 }, { 70, 3 }, { 71, 3 },
			{ 72, 3 }, { 73, 3 }, { 74, 3 }, { 75, 3 }, { 76, 3 }, { 77, 3 },
			{ 78, 3 }, { 79, 3 }, { 80, 3 }, { 81, 3 }, { 82, 3 }, { 83, 3 },
			{ 84, 3 }, { 85, 3 }, { 86, 3 }, { 87, 3 }, { 88, 3 }, { 89, 3 },
			{ 90, 3 }, { 91, 3 }, { 92, 3 }, { 93, 3 }, { 94, 3 }, { 95, 3 },
			{ 96, 3 }, { 97, 3 }, { 98, 3 }, { 99, 3 }, { 100, 3 }, { 101, 3 },
			{ 102, 3 }, { 103, 3 }, { 104, 3 }, { 105, 3 }, { 106, 3 },
			{ 107, 3 }, { 108, 3 }, { 109, 3 }, { 110, 3 }, { 111, 3 },
			{ 112, 3 }, { 113, 3 }, { 114, 3 }, { 115, 3 }, { 116, 3 },
			{ 117, 3 }, { 118, 3 }, { 119, 3 }, { 120, 3 }, { 121, 3 },
			{ 122, 3 }, { 123, 3 }, { 124, 3 }, { 125, 3 }, { 126, 3 },
			{ 161, 3 }, { 162, 3 }, { 163, 3 }, { 164, 3 }, { 165, 3 },
			{ 166, 3 }, { 167, 3 }, { 168, 3 }, { 169, 3 }, { 170, 3 },
			{ 171, 3 }, { 172, 3 }, { 173, 3 }, { 174, 3 }, { 175, 3 },
			{ 176, 3 }, { 177, 3 }, { 178, 3 }, { 179, 3 }, { 180, 3 },
			{ 181, 3 }, { 182, 3 }, { 183, 3 }, { 184, 3 }, { 185, 3 },
			{ 186, 3 }, { 187, 3 }, { 188, 3 }, { 189, 3 }, { 190, 3 },
			{ 191, 3 }, { 192, 3 }, { 193, 3 }, { 194, 3 }, { 195, 3 },
			{ 196, 3 }, { 197, 3 }, { 198, 3 }, { 199, 3 }, { 200, 3 },
			{ 201, 3 }, { 202, 3 }, { 203, 3 }, { 204, 3 }, { 205, 3 },
			{ 206, 3 }, { 207, 3 }, { 208, 3 }, { 209, 3 }, { 210, 3 },
			{ 211, 3 }, { 212, 3 }, { 213, 3 }, { 214, 3 }, { 215, 3 },
			{ 216, 3 }, { 217, 3 }, { 218, 3 }, { 219, 3 }, { 220, 3 },
			{ 221, 3 }, { 222, 3 }, { 223, 3 }, { 224, 3 }, { 225, 3 },
			{ 226, 3 }, { 227, 3 }, { 228, 3 }, { 229, 3 }, { 230, 3 },
			{ 231, 3 }, { 232, 3 }, { 233, 3 }, { 234, 3 }, { 235, 3 },
			{ 236, 3 }, { 237, 3 }, { 238, 3 }, { 239, 3 }, { 240, 3 },
			{ 241, 3 }, { 242, 3 }, { 243, 3 }, { 244, 3 }, { 245, 3 },
			{ 246, 3 }, { 247, 3 }, { 248, 3 }, { 249, 3 }, { 250, 3 },
			{ 251, 3 }, { 252, 3 }, { 253, 3 }, { 254, 3 }, { 255, 3 },
			{ 46, 25 }, { 48, 26 }, { 49, 26 }, { 50, 26 }, { 51, 26 },
			{ 52, 26 }, { 53, 26 }, { 54, 26 }, { 55, 26 }, { 56, 26 },
			{ 57, 26 }, { 42, 27 }, { 46, 28 }, { 48, 12 }, { 49, 12 },
			{ 50, 12 }, { 51, 12 }, { 52, 12 }, { 53, 12 }, { 54, 12 },
			{ 55, 12 }, { 56, 12 }, { 57, 12 }, { 69, 29 }, { 101, 29 },
			{ 61, 30 }, { 61, 31 }, { 62, 32 }, { 61, 33 }, { 48, 34 },
			{ 49, 34 }, { 50, 34 }, { 51, 34 }, { 52, 34 }, { 53, 34 },
			{ 54, 34 }, { 55, 34 }, { 56, 34 }, { 57, 34 }, { 65, 34 },
			{ 66, 34 }, { 67, 34 }, { 68, 34 }, { 69, 34 }, { 70, 34 },
			{ 71, 34 }, { 72, 34 }, { 73, 34 }, { 74, 34 }, { 75, 34 },
			{ 76, 34 }, { 77, 34 }, { 78, 34 }, { 79, 34 }, { 80, 34 },
			{ 81, 34 }, { 82, 34 }, { 83, 34 }, { 84, 34 }, { 85, 34 },
			{ 86, 34 }, { 87, 34 }, { 88, 34 }, { 89, 34 }, { 90, 34 },
			{ 97, 34 }, { 98, 34 }, { 99, 34 }, { 100, 34 }, { 101, 34 },
			{ 102, 34 }, { 103, 34 }, { 104, 34 }, { 105, 34 }, { 106, 34 },
			{ 107, 34 }, { 108, 34 }, { 109, 34 }, { 110, 34 }, { 111, 34 },
			{ 112, 34 }, { 113, 34 }, { 114, 34 }, { 115, 34 }, { 116, 34 },
			{ 117, 34 }, { 118, 34 }, { 119, 34 }, { 120, 34 }, { 121, 34 },
			{ 122, 34 }, { 48, 35 }, { 49, 35 }, { 50, 35 }, { 51, 35 },
			{ 52, 35 }, { 53, 35 }, { 54, 35 }, { 55, 35 }, { 56, 35 },
			{ 57, 35 }, { 64, 36 }, { 65, 35 }, { 66, 35 }, { 67, 35 },
			{ 68, 35 }, { 69, 35 }, { 70, 35 }, { 71, 35 }, { 72, 35 },
			{ 73, 35 }, { 74, 35 }, { 75, 35 }, { 76, 35 }, { 77, 35 },
			{ 78, 35 }, { 79, 35 }, { 80, 35 }, { 81, 35 }, { 82, 35 },
			{ 83, 35 }, { 84, 35 }, { 85, 35 }, { 86, 35 }, { 87, 35 },
			{ 88, 35 }, { 89, 35 }, { 90, 35 }, { 95, 36 }, { 97, 35 },
			{ 98, 35 }, { 99, 35 }, { 100, 35 }, { 101, 35 }, { 102, 35 },
			{ 103, 35 }, { 104, 35 }, { 105, 35 }, { 106, 35 }, { 107, 35 },
			{ 108, 35 }, { 109, 35 }, { 110, 35 }, { 111, 35 }, { 112, 35 },
			{ 113, 35 }, { 114, 35 }, { 115, 35 }, { 116, 35 }, { 117, 35 },
			{ 118, 35 }, { 119, 35 }, { 120, 35 }, { 121, 35 }, { 122, 35 },
			{ 48, 26 }, { 49, 26 }, { 50, 26 }, { 51, 26 }, { 52, 26 },
			{ 53, 26 }, { 54, 26 }, { 55, 26 }, { 56, 26 }, { 57, 26 },
			{ 69, 37 }, { 101, 37 }, { 9, 27 }, { 10, 27 }, { 13, 27 },
			{ 32, 27 }, { 33, 27 }, { 34, 27 }, { 35, 27 }, { 36, 27 },
			{ 37, 27 }, { 38, 27 }, { 39, 27 }, { 40, 27 }, { 41, 27 },
			{ 42, 38 }, { 43, 27 }, { 44, 27 }, { 45, 27 }, { 46, 27 },
			{ 47, 39 }, { 48, 27 }, { 49, 27 }, { 50, 27 }, { 51, 27 },
			{ 52, 27 }, { 53, 27 }, { 54, 27 }, { 55, 27 }, { 56, 27 },
			{ 57, 27 }, { 58, 27 }, { 59, 27 }, { 60, 27 }, { 61, 27 },
			{ 62, 27 }, { 63, 27 }, { 64, 27 }, { 65, 27 }, { 66, 27 },
			{ 67, 27 }, { 68, 27 }, { 69, 27 }, { 70, 27 }, { 71, 27 },
			{ 72, 27 }, { 73, 27 }, { 74, 27 }, { 75, 27 }, { 76, 27 },
			{ 77, 27 }, { 78, 27 }, { 79, 27 }, { 80, 27 }, { 81, 27 },
			{ 82, 27 }, { 83, 27 }, { 84, 27 }, { 85, 27 }, { 86, 27 },
			{ 87, 27 }, { 88, 27 }, { 89, 27 }, { 90, 27 }, { 91, 27 },
			{ 92, 27 }, { 93, 27 }, { 94, 27 }, { 95, 27 }, { 96, 27 },
			{ 97, 27 }, { 98, 27 }, { 99, 27 }, { 100, 27 }, { 101, 27 },
			{ 102, 27 }, { 103, 27 }, { 104, 27 }, { 105, 27 }, { 106, 27 },
			{ 107, 27 }, { 108, 27 }, { 109, 27 }, { 110, 27 }, { 111, 27 },
			{ 112, 27 }, { 113, 27 }, { 114, 27 }, { 115, 27 }, { 116, 27 },
			{ 117, 27 }, { 118, 27 }, { 119, 27 }, { 120, 27 }, { 121, 27 },
			{ 122, 27 }, { 123, 27 }, { 124, 27 }, { 125, 27 }, { 126, 27 },
			{ 161, 27 }, { 162, 27 }, { 163, 27 }, { 164, 27 }, { 165, 27 },
			{ 166, 27 }, { 167, 27 }, { 168, 27 }, { 169, 27 }, { 170, 27 },
			{ 171, 27 }, { 172, 27 }, { 173, 27 }, { 174, 27 }, { 175, 27 },
			{ 176, 27 }, { 177, 27 }, { 178, 27 }, { 179, 27 }, { 180, 27 },
			{ 181, 27 }, { 182, 27 }, { 183, 27 }, { 184, 27 }, { 185, 27 },
			{ 186, 27 }, { 187, 27 }, { 188, 27 }, { 189, 27 }, { 190, 27 },
			{ 191, 27 }, { 192, 27 }, { 193, 27 }, { 194, 27 }, { 195, 27 },
			{ 196, 27 }, { 197, 27 }, { 198, 27 }, { 199, 27 }, { 200, 27 },
			{ 201, 27 }, { 202, 27 }, { 203, 27 }, { 204, 27 }, { 205, 27 },
			{ 206, 27 }, { 207, 27 }, { 208, 27 }, { 209, 27 }, { 210, 27 },
			{ 211, 27 }, { 212, 27 }, { 213, 27 }, { 214, 27 }, { 215, 27 },
			{ 216, 27 }, { 217, 27 }, { 218, 27 }, { 219, 27 }, { 220, 27 },
			{ 221, 27 }, { 222, 27 }, { 223, 27 }, { 224, 27 }, { 225, 27 },
			{ 226, 27 }, { 227, 27 }, { 228, 27 }, { 229, 27 }, { 230, 27 },
			{ 231, 27 }, { 232, 27 }, { 233, 27 }, { 234, 27 }, { 235, 27 },
			{ 236, 27 }, { 237, 27 }, { 238, 27 }, { 239, 27 }, { 240, 27 },
			{ 241, 27 }, { 242, 27 }, { 243, 27 }, { 244, 27 }, { 245, 27 },
			{ 246, 27 }, { 247, 27 }, { 248, 27 }, { 249, 27 }, { 250, 27 },
			{ 251, 27 }, { 252, 27 }, { 253, 27 }, { 254, 27 }, { 255, 27 },
			{ 48, 28 }, { 49, 28 }, { 50, 28 }, { 51, 28 }, { 52, 28 },
			{ 53, 28 }, { 54, 28 }, { 55, 28 }, { 56, 28 }, { 57, 28 },
			{ 69, 37 }, { 101, 37 }, { 43, 40 }, { 45, 40 }, { 48, 41 },
			{ 49, 41 }, { 50, 41 }, { 51, 41 }, { 52, 41 }, { 53, 41 },
			{ 54, 41 }, { 55, 41 }, { 56, 41 }, { 57, 41 }, { 48, 34 },
			{ 49, 34 }, { 50, 34 }, { 51, 34 }, { 52, 34 }, { 53, 34 },
			{ 54, 34 }, { 55, 34 }, { 56, 34 }, { 57, 34 }, { 64, 42 },
			{ 65, 34 }, { 66, 34 }, { 67, 34 }, { 68, 34 }, { 69, 34 },
			{ 70, 34 }, { 71, 34 }, { 72, 34 }, { 73, 34 }, { 74, 34 },
			{ 75, 34 }, { 76, 34 }, { 77, 34 }, { 78, 34 }, { 79, 34 },
			{ 80, 34 }, { 81, 34 }, { 82, 34 }, { 83, 34 }, { 84, 34 },
			{ 85, 34 }, { 86, 34 }, { 87, 34 }, { 88, 34 }, { 89, 34 },
			{ 90, 34 }, { 95, 42 }, { 97, 34 }, { 98, 34 }, { 99, 34 },
			{ 100, 34 }, { 101, 34 }, { 102, 34 }, { 103, 34 }, { 104, 34 },
			{ 105, 34 }, { 106, 34 }, { 107, 34 }, { 108, 34 }, { 109, 34 },
			{ 110, 34 }, { 111, 34 }, { 112, 34 }, { 113, 34 }, { 114, 34 },
			{ 115, 34 }, { 116, 34 }, { 117, 34 }, { 118, 34 }, { 119, 34 },
			{ 120, 34 }, { 121, 34 }, { 122, 34 }, { 48, 35 }, { 49, 35 },
			{ 50, 35 }, { 51, 35 }, { 52, 35 }, { 53, 35 }, { 54, 35 },
			{ 55, 35 }, { 56, 35 }, { 57, 35 }, { 64, 36 }, { 65, 35 },
			{ 66, 35 }, { 67, 35 }, { 68, 35 }, { 69, 35 }, { 70, 35 },
			{ 71, 35 }, { 72, 35 }, { 73, 35 }, { 74, 35 }, { 75, 35 },
			{ 76, 35 }, { 77, 35 }, { 78, 35 }, { 79, 35 }, { 80, 35 },
			{ 81, 35 }, { 82, 35 }, { 83, 35 }, { 84, 35 }, { 85, 35 },
			{ 86, 35 }, { 87, 35 }, { 88, 35 }, { 89, 35 }, { 90, 35 },
			{ 95, 36 }, { 97, 35 }, { 98, 35 }, { 99, 35 }, { 100, 35 },
			{ 101, 35 }, { 102, 35 }, { 103, 35 }, { 104, 35 }, { 105, 35 },
			{ 106, 35 }, { 107, 35 }, { 108, 35 }, { 109, 35 }, { 110, 35 },
			{ 111, 35 }, { 112, 35 }, { 113, 35 }, { 114, 35 }, { 115, 35 },
			{ 116, 35 }, { 117, 35 }, { 118, 35 }, { 119, 35 }, { 120, 35 },
			{ 121, 35 }, { 122, 35 }, { 48, 35 }, { 49, 35 }, { 50, 35 },
			{ 51, 35 }, { 52, 35 }, { 53, 35 }, { 54, 35 }, { 55, 35 },
			{ 56, 35 }, { 57, 35 }, { 65, 35 }, { 66, 35 }, { 67, 35 },
			{ 68, 35 }, { 69, 35 }, { 70, 35 }, { 71, 35 }, { 72, 35 },
			{ 73, 35 }, { 74, 35 }, { 75, 35 }, { 76, 35 }, { 77, 35 },
			{ 78, 35 }, { 79, 35 }, { 80, 35 }, { 81, 35 }, { 82, 35 },
			{ 83, 35 }, { 84, 35 }, { 85, 35 }, { 86, 35 }, { 87, 35 },
			{ 88, 35 }, { 89, 35 }, { 90, 35 }, { 97, 35 }, { 98, 35 },
			{ 99, 35 }, { 100, 35 }, { 101, 35 }, { 102, 35 }, { 103, 35 },
			{ 104, 35 }, { 105, 35 }, { 106, 35 }, { 107, 35 }, { 108, 35 },
			{ 109, 35 }, { 110, 35 }, { 111, 35 }, { 112, 35 }, { 113, 35 },
			{ 114, 35 }, { 115, 35 }, { 116, 35 }, { 117, 35 }, { 118, 35 },
			{ 119, 35 }, { 120, 35 }, { 121, 35 }, { 122, 35 }, { 43, 43 },
			{ 45, 43 }, { 48, 44 }, { 49, 44 }, { 50, 44 }, { 51, 44 },
			{ 52, 44 }, { 53, 44 }, { 54, 44 }, { 55, 44 }, { 56, 44 },
			{ 57, 44 }, { 9, 27 }, { 10, 27 }, { 13, 27 }, { 32, 27 },
			{ 33, 27 }, { 34, 27 }, { 35, 27 }, { 36, 27 }, { 37, 27 },
			{ 38, 27 }, { 39, 27 }, { 40, 27 }, { 41, 27 }, { 42, 38 },
			{ 43, 27 }, { 44, 27 }, { 45, 27 }, { 46, 27 }, { 47, 45 },
			{ 48, 27 }, { 49, 27 }, { 50, 27 }, { 51, 27 }, { 52, 27 },
			{ 53, 27 }, { 54, 27 }, { 55, 27 }, { 56, 27 }, { 57, 27 },
			{ 58, 27 }, { 59, 27 }, { 60, 27 }, { 61, 27 }, { 62, 27 },
			{ 63, 27 }, { 64, 27 }, { 65, 27 }, { 66, 27 }, { 67, 27 },
			{ 68, 27 }, { 69, 27 }, { 70, 27 }, { 71, 27 }, { 72, 27 },
			{ 73, 27 }, { 74, 27 }, { 75, 27 }, { 76, 27 }, { 77, 27 },
			{ 78, 27 }, { 79, 27 }, { 80, 27 }, { 81, 27 }, { 82, 27 },
			{ 83, 27 }, { 84, 27 }, { 85, 27 }, { 86, 27 }, { 87, 27 },
			{ 88, 27 }, { 89, 27 }, { 90, 27 }, { 91, 27 }, { 92, 27 },
			{ 93, 27 }, { 94, 27 }, { 95, 27 }, { 96, 27 }, { 97, 27 },
			{ 98, 27 }, { 99, 27 }, { 100, 27 }, { 101, 27 }, { 102, 27 },
			{ 103, 27 }, { 104, 27 }, { 105, 27 }, { 106, 27 }, { 107, 27 },
			{ 108, 27 }, { 109, 27 }, { 110, 27 }, { 111, 27 }, { 112, 27 },
			{ 113, 27 }, { 114, 27 }, { 115, 27 }, { 116, 27 }, { 117, 27 },
			{ 118, 27 }, { 119, 27 }, { 120, 27 }, { 121, 27 }, { 122, 27 },
			{ 123, 27 }, { 124, 27 }, { 125, 27 }, { 126, 27 }, { 161, 27 },
			{ 162, 27 }, { 163, 27 }, { 164, 27 }, { 165, 27 }, { 166, 27 },
			{ 167, 27 }, { 168, 27 }, { 169, 27 }, { 170, 27 }, { 171, 27 },
			{ 172, 27 }, { 173, 27 }, { 174, 27 }, { 175, 27 }, { 176, 27 },
			{ 177, 27 }, { 178, 27 }, { 179, 27 }, { 180, 27 }, { 181, 27 },
			{ 182, 27 }, { 183, 27 }, { 184, 27 }, { 185, 27 }, { 186, 27 },
			{ 187, 27 }, { 188, 27 }, { 189, 27 }, { 190, 27 }, { 191, 27 },
			{ 192, 27 }, { 193, 27 }, { 194, 27 }, { 195, 27 }, { 196, 27 },
			{ 197, 27 }, { 198, 27 }, { 199, 27 }, { 200, 27 }, { 201, 27 },
			{ 202, 27 }, { 203, 27 }, { 204, 27 }, { 205, 27 }, { 206, 27 },
			{ 207, 27 }, { 208, 27 }, { 209, 27 }, { 210, 27 }, { 211, 27 },
			{ 212, 27 }, { 213, 27 }, { 214, 27 }, { 215, 27 }, { 216, 27 },
			{ 217, 27 }, { 218, 27 }, { 219, 27 }, { 220, 27 }, { 221, 27 },
			{ 222, 27 }, { 223, 27 }, { 224, 27 }, { 225, 27 }, { 226, 27 },
			{ 227, 27 }, { 228, 27 }, { 229, 27 }, { 230, 27 }, { 231, 27 },
			{ 232, 27 }, { 233, 27 }, { 234, 27 }, { 235, 27 }, { 236, 27 },
			{ 237, 27 }, { 238, 27 }, { 239, 27 }, { 240, 27 }, { 241, 27 },
			{ 242, 27 }, { 243, 27 }, { 244, 27 }, { 245, 27 }, { 246, 27 },
			{ 247, 27 }, { 248, 27 }, { 249, 27 }, { 250, 27 }, { 251, 27 },
			{ 252, 27 }, { 253, 27 }, { 254, 27 }, { 255, 27 }, { 9, 27 },
			{ 10, 27 }, { 13, 27 }, { 32, 27 }, { 33, 27 }, { 34, 27 },
			{ 35, 27 }, { 36, 27 }, { 37, 27 }, { 38, 27 }, { 39, 27 },
			{ 40, 27 }, { 41, 27 }, { 42, 38 }, { 43, 27 }, { 44, 27 },
			{ 45, 27 }, { 46, 27 }, { 47, 39 }, { 48, 27 }, { 49, 27 },
			{ 50, 27 }, { 51, 27 }, { 52, 27 }, { 53, 27 }, { 54, 27 },
			{ 55, 27 }, { 56, 27 }, { 57, 27 }, { 58, 27 }, { 59, 27 },
			{ 60, 27 }, { 61, 27 }, { 62, 27 }, { 63, 27 }, { 64, 27 },
			{ 65, 27 }, { 66, 27 }, { 67, 27 }, { 68, 27 }, { 69, 27 },
			{ 70, 27 }, { 71, 27 }, { 72, 27 }, { 73, 27 }, { 74, 27 },
			{ 75, 27 }, { 76, 27 }, { 77, 27 }, { 78, 27 }, { 79, 27 },
			{ 80, 27 }, { 81, 27 }, { 82, 27 }, { 83, 27 }, { 84, 27 },
			{ 85, 27 }, { 86, 27 }, { 87, 27 }, { 88, 27 }, { 89, 27 },
			{ 90, 27 }, { 91, 27 }, { 92, 27 }, { 93, 27 }, { 94, 27 },
			{ 95, 27 }, { 96, 27 }, { 97, 27 }, { 98, 27 }, { 99, 27 },
			{ 100, 27 }, { 101, 27 }, { 102, 27 }, { 103, 27 }, { 104, 27 },
			{ 105, 27 }, { 106, 27 }, { 107, 27 }, { 108, 27 }, { 109, 27 },
			{ 110, 27 }, { 111, 27 }, { 112, 27 }, { 113, 27 }, { 114, 27 },
			{ 115, 27 }, { 116, 27 }, { 117, 27 }, { 118, 27 }, { 119, 27 },
			{ 120, 27 }, { 121, 27 }, { 122, 27 }, { 123, 27 }, { 124, 27 },
			{ 125, 27 }, { 126, 27 }, { 161, 27 }, { 162, 27 }, { 163, 27 },
			{ 164, 27 }, { 165, 27 }, { 166, 27 }, { 167, 27 }, { 168, 27 },
			{ 169, 27 }, { 170, 27 }, { 171, 27 }, { 172, 27 }, { 173, 27 },
			{ 174, 27 }, { 175, 27 }, { 176, 27 }, { 177, 27 }, { 178, 27 },
			{ 179, 27 }, { 180, 27 }, { 181, 27 }, { 182, 27 }, { 183, 27 },
			{ 184, 27 }, { 185, 27 }, { 186, 27 }, { 187, 27 }, { 188, 27 },
			{ 189, 27 }, { 190, 27 }, { 191, 27 }, { 192, 27 }, { 193, 27 },
			{ 194, 27 }, { 195, 27 }, { 196, 27 }, { 197, 27 }, { 198, 27 },
			{ 199, 27 }, { 200, 27 }, { 201, 27 }, { 202, 27 }, { 203, 27 },
			{ 204, 27 }, { 205, 27 }, { 206, 27 }, { 207, 27 }, { 208, 27 },
			{ 209, 27 }, { 210, 27 }, { 211, 27 }, { 212, 27 }, { 213, 27 },
			{ 214, 27 }, { 215, 27 }, { 216, 27 }, { 217, 27 }, { 218, 27 },
			{ 219, 27 }, { 220, 27 }, { 221, 27 }, { 222, 27 }, { 223, 27 },
			{ 224, 27 }, { 225, 27 }, { 226, 27 }, { 227, 27 }, { 228, 27 },
			{ 229, 27 }, { 230, 27 }, { 231, 27 }, { 232, 27 }, { 233, 27 },
			{ 234, 27 }, { 235, 27 }, { 236, 27 }, { 237, 27 }, { 238, 27 },
			{ 239, 27 }, { 240, 27 }, { 241, 27 }, { 242, 27 }, { 243, 27 },
			{ 244, 27 }, { 245, 27 }, { 246, 27 }, { 247, 27 }, { 248, 27 },
			{ 249, 27 }, { 250, 27 }, { 251, 27 }, { 252, 27 }, { 253, 27 },
			{ 254, 27 }, { 255, 27 }, { 48, 41 }, { 49, 41 }, { 50, 41 },
			{ 51, 41 }, { 52, 41 }, { 53, 41 }, { 54, 41 }, { 55, 41 },
			{ 56, 41 }, { 57, 41 }, { 48, 46 }, { 49, 46 }, { 50, 46 },
			{ 51, 46 }, { 52, 46 }, { 53, 46 }, { 54, 46 }, { 55, 46 },
			{ 56, 46 }, { 57, 46 }, { 48, 34 }, { 49, 34 }, { 50, 34 },
			{ 51, 34 }, { 52, 34 }, { 53, 34 }, { 54, 34 }, { 55, 34 },
			{ 56, 34 }, { 57, 34 }, { 65, 34 }, { 66, 34 }, { 67, 34 },
			{ 68, 34 }, { 69, 34 }, { 70, 34 }, { 71, 34 }, { 72, 34 },
			{ 73, 34 }, { 74, 34 }, { 75, 34 }, { 76, 34 }, { 77, 34 },
			{ 78, 34 }, { 79, 34 }, { 80, 34 }, { 81, 34 }, { 82, 34 },
			{ 83, 34 }, { 84, 34 }, { 85, 34 }, { 86, 34 }, { 87, 34 },
			{ 88, 34 }, { 89, 34 }, { 90, 34 }, { 97, 34 }, { 98, 34 },
			{ 99, 34 }, { 100, 34 }, { 101, 34 }, { 102, 34 }, { 103, 34 },
			{ 104, 34 }, { 105, 34 }, { 106, 34 }, { 107, 34 }, { 108, 34 },
			{ 109, 34 }, { 110, 34 }, { 111, 34 }, { 112, 34 }, { 113, 34 },
			{ 114, 34 }, { 115, 34 }, { 116, 34 }, { 117, 34 }, { 118, 34 },
			{ 119, 34 }, { 120, 34 }, { 121, 34 }, { 122, 34 }, { 48, 44 },
			{ 49, 44 }, { 50, 44 }, { 51, 44 }, { 52, 44 }, { 53, 44 },
			{ 54, 44 }, { 55, 44 }, { 56, 44 }, { 57, 44 }, { 48, 47 },
			{ 49, 47 }, { 50, 47 }, { 51, 47 }, { 52, 47 }, { 53, 47 },
			{ 54, 47 }, { 55, 47 }, { 56, 47 }, { 57, 47 }, { 9, 27 },
			{ 10, 27 }, { 13, 27 }, { 32, 27 }, { 33, 27 }, { 34, 27 },
			{ 35, 27 }, { 36, 27 }, { 37, 27 }, { 38, 27 }, { 39, 27 },
			{ 40, 27 }, { 41, 27 }, { 42, 38 }, { 43, 27 }, { 44, 27 },
			{ 45, 27 }, { 46, 27 }, { 47, 39 }, { 48, 27 }, { 49, 27 },
			{ 50, 27 }, { 51, 27 }, { 52, 27 }, { 53, 27 }, { 54, 27 },
			{ 55, 27 }, { 56, 27 }, { 57, 27 }, { 58, 27 }, { 59, 27 },
			{ 60, 27 }, { 61, 27 }, { 62, 27 }, { 63, 27 }, { 64, 27 },
			{ 65, 27 }, { 66, 27 }, { 67, 27 }, { 68, 27 }, { 69, 27 },
			{ 70, 27 }, { 71, 27 }, { 72, 27 }, { 73, 27 }, { 74, 27 },
			{ 75, 27 }, { 76, 27 }, { 77, 27 }, { 78, 27 }, { 79, 27 },
			{ 80, 27 }, { 81, 27 }, { 82, 27 }, { 83, 27 }, { 84, 27 },
			{ 85, 27 }, { 86, 27 }, { 87, 27 }, { 88, 27 }, { 89, 27 },
			{ 90, 27 }, { 91, 27 }, { 92, 27 }, { 93, 27 }, { 94, 27 },
			{ 95, 27 }, { 96, 27 }, { 97, 27 }, { 98, 27 }, { 99, 27 },
			{ 100, 27 }, { 101, 27 }, { 102, 27 }, { 103, 27 }, { 104, 27 },
			{ 105, 27 }, { 106, 27 }, { 107, 27 }, { 108, 27 }, { 109, 27 },
			{ 110, 27 }, { 111, 27 }, { 112, 27 }, { 113, 27 }, { 114, 27 },
			{ 115, 27 }, { 116, 27 }, { 117, 27 }, { 118, 27 }, { 119, 27 },
			{ 120, 27 }, { 121, 27 }, { 122, 27 }, { 123, 27 }, { 124, 27 },
			{ 125, 27 }, { 126, 27 }, { 161, 27 }, { 162, 27 }, { 163, 27 },
			{ 164, 27 }, { 165, 27 }, { 166, 27 }, { 167, 27 }, { 168, 27 },
			{ 169, 27 }, { 170, 27 }, { 171, 27 }, { 172, 27 }, { 173, 27 },
			{ 174, 27 }, { 175, 27 }, { 176, 27 }, { 177, 27 }, { 178, 27 },
			{ 179, 27 }, { 180, 27 }, { 181, 27 }, { 182, 27 }, { 183, 27 },
			{ 184, 27 }, { 185, 27 }, { 186, 27 }, { 187, 27 }, { 188, 27 },
			{ 189, 27 }, { 190, 27 }, { 191, 27 }, { 192, 27 }, { 193, 27 },
			{ 194, 27 }, { 195, 27 }, { 196, 27 }, { 197, 27 }, { 198, 27 },
			{ 199, 27 }, { 200, 27 }, { 201, 27 }, { 202, 27 }, { 203, 27 },
			{ 204, 27 }, { 205, 27 }, { 206, 27 }, { 207, 27 }, { 208, 27 },
			{ 209, 27 }, { 210, 27 }, { 211, 27 }, { 212, 27 }, { 213, 27 },
			{ 214, 27 }, { 215, 27 }, { 216, 27 }, { 217, 27 }, { 218, 27 },
			{ 219, 27 }, { 220, 27 }, { 221, 27 }, { 222, 27 }, { 223, 27 },
			{ 224, 27 }, { 225, 27 }, { 226, 27 }, { 227, 27 }, { 228, 27 },
			{ 229, 27 }, { 230, 27 }, { 231, 27 }, { 232, 27 }, { 233, 27 },
			{ 234, 27 }, { 235, 27 }, { 236, 27 }, { 237, 27 }, { 238, 27 },
			{ 239, 27 }, { 240, 27 }, { 241, 27 }, { 242, 27 }, { 243, 27 },
			{ 244, 27 }, { 245, 27 }, { 246, 27 }, { 247, 27 }, { 248, 27 },
			{ 249, 27 }, { 250, 27 }, { 251, 27 }, { 252, 27 }, { 253, 27 },
			{ 254, 27 }, { 255, 27 }, { 48, 46 }, { 49, 46 }, { 50, 46 },
			{ 51, 46 }, { 52, 46 }, { 53, 46 }, { 54, 46 }, { 55, 46 },
			{ 56, 46 }, { 57, 46 }, { 48, 47 }, { 49, 47 }, { 50, 47 },
			{ 51, 47 }, { 52, 47 }, { 53, 47 }, { 54, 47 }, { 55, 47 },
			{ 56, 47 }, { 57, 47 } };

	int[] TOKEN_STATE = { 0, 0, 0, -1, 45, 46, 51, 49, 40, 50, 41, 52, 36, 53,
			39, 43, 44, 42, -1, 2, 47, 48, 33, 34, 38, 55, 37, -1, 37, -1, 54,
			57, 56, 35, 2, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 36, 37 };

	int[] SPECIAL_CASES_INDEXES = { 0, 0, 0, 30, 30, 30, 30, 30, 30, 30, 30,
			30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30,
			30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30,
			30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30 };

	String[] SPECIAL_CASES_KEYS = { "booleano", "cadeia", "caracter", "de",
			"div", "e", "enquanto", "entao", "escreva", "faca", "falso", "fim",
			"funcao", "inicio", "inteiro", "leia", "metodo", "nao", "ou",
			"procedimento", "programa", "real", "ref", "retorne", "se",
			"senao", "val", "var", "verdadeiro", "vetor" };

	int[] SPECIAL_CASES_VALUES = { 11, 6, 5, 23, 32, 19, 27, 14, 17, 24, 21, 9,
			12, 8, 10, 16, 28, 20, 18, 7, 3, 25, 29, 31, 13, 15, 30, 4, 22, 26 };

	String[] SCANNER_ERROR = { "Caractere n�o esperado", "", "",
			"Erro identificando literal", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "Erro identificando id", "", "", "", "", "",
			"", "", "", "Erro identificando <ignorar>", "",
			"Erro identificando num_int", "", "", "", "", "", "",
			"Erro identificando id", "Erro identificando num_real",
			"Erro identificando <ignorar>", "Erro identificando <ignorar>",
			"Erro identificando num_int", "Erro identificando num_int",
			"Erro identificando id", "Erro identificando num_real",
			"Erro identificando num_real", "", "", "" };

}
