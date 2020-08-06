package mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input a string");
		String str = sc.nextLine();
		System.out.println("input a character that you wanna count");
		char character = sc.next().charAt(0);
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==character) {
				count++;
			}
		}
		System.out.println(count);
	}

}
