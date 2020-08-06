package IntroductionToJava.thuc_hanh;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input a year that you wanna check:");
		int year =scanner.nextInt();
		isLeapYear(year);
	}
	public static void isLeapYear(int year) {
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println(year+ " is a leap year");
		}else {
			System.out.println(year+ " is not  a leap year");
		}
	}
}
