package mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class SumColum {

	public static void main(String[] args) {
		int[][] matrix = {
				{0, 983, 787, 714, 1375, 967, 1087},
		        {3, 0, 214, 1102, 1763, 1723, 1842},
		        {7, 214, 0, 888, 1549, 1548, 1627},
		        {4, 1102, 888, 0, 661, 781, 810},
		        {75, 1763, 1549, 661, 0, 1426, 1187},
		        {7, 1723, 1548, 781, 14026, 0, 239},
		        {10, 1842, 1627, 810, 1187, 239, 0},
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the colum that you wanna count sum");
 		int colum= sc.nextInt();
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			sum+= matrix[i][colum];
		}
		System.out.println("sum of colum "+colum+" is "+sum);
	}

}
