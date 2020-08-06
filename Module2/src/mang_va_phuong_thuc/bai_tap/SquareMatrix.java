package mang_va_phuong_thuc.bai_tap;

public class SquareMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 983, 787, 714, 1375, 967, 1087},
		        {983, 2, 214, 1102, 1763, 1723, 1842},
		        {787, 214, 3, 888, 1549, 1548, 1627},
		        {714, 1102, 888, 4, 661, 781, 810},
		        {1375, 1763, 1549, 661, 5, 1426, 1187},
		        {967, 1723, 1548, 781, 14026, 6, 239},
		        {1087, 1842, 1627, 810, 1187, 239, 7},
		};
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			sum+=matrix[i][i];
		}
		System.out.println("sum of square diagonal lines is "+sum);
	}

}
