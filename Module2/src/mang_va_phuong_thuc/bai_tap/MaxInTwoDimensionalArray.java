package mang_va_phuong_thuc.bai_tap;

public class MaxInTwoDimensionalArray {

	public static void main(String[] args) {
		int[][] matrix = {
				{0, 983, 787, 714, 1375, 967, 1087},
		        {983, 0, 214, 1102, 1763, 1723, 1842},
		        {787, 214, 0, 888, 1549, 1548, 1627},
		        {714, 1102, 888, 0, 661, 781, 810},
		        {1375, 1763, 1549, 661, 0, 1426, 1187},
		        {967, 1723, 1548, 781, 14026, 0, 239},
		        {1087, 1842, 1627, 810, 1187, 239, 0},
		};
		// find max element in two-dimensional array
		int max =matrix[0][0];
		for (int row = 0; row < matrix.length; row++) {
		    for (int column = 0; column < matrix[row].length; column++) {
		        if(matrix[row][column]>max) {
		        	max=matrix[row][column];
		        }
		    }
		}
		
		System.out.println("max is "+max);
	}

}
