package mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class FindMinInArrray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input size of array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("input element ");
		for(int i=0;i<array.length;i++) {
			array[i]= sc.nextInt();
		}
		int min= array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min= array[i];
			}
		}
		// print min
		System.out.println("min is "+min);
	}

}
