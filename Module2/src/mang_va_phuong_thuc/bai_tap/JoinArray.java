package mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class JoinArray {

	public static void main(String[] args) {
		int [] array1 = new int[3];
		int [] array2 = new int[4];
		int [] array3 = new int[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("input elements of array 1:");
		for(int i=0;i<array1.length;i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("input elements of array 2:");
		for(int i=0;i<array2.length;i++) {
			array2[i] = sc.nextInt();
		}
		for(int i=0; i<array3.length;i++) {
			if(i<array1.length) {
				array3[i]=array1[i];
			}else {
				array3[i]=array2[i-array1.length];
			}
		}
		System.out.println("all of elements in Array 3");
		for(int i=0; i<array3.length;i++) {
			System.out.println(array3[i]+"\t");
		}
	}

}
