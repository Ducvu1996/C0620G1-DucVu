package IntroductionToJava.bai_tap;

import java.io.InputStream;
import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		// change USD into VND
		double rate = 230000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the mount of USD that you wanna change:");
		double usd= sc.nextDouble();
		System.out.println(usd+"$ = "+usd*rate+"VND");
		
	}


}
