package mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class AdditionElement {

	public static void main(String[] args) {
		int [] array = new int[7];
		array[0]= 1;
		array[1]= 3;
		array[2]= 4;
		array[3]= 9;
		array[4]= 2;
		array[5]= 20;
		Scanner sc = new Scanner(System.in);
		System.out.println("input a index that you wanna add: ");
		int index= sc.nextInt();
		for(int i=index;i<array.length-1;i++) {
		
			 array[i+1]=array[i];
			
		}
		array[array.length-1]=0;
		System.out.println("input a number that you wanna add : ");
		int x= sc.nextInt();
		array[index]=x;
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+"\t");
		}
	}

}
