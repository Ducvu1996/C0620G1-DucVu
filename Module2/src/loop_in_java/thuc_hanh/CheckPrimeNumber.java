package loop_in_java.thuc_hanh;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number that you wanna check");
		int number = sc.nextInt();
		
		if(isPrimeNumber(number)== true) {
			System.out.println(number+" is a prime number");
		}else {
			System.out.println(number+" is not a prime number");

		}
	}
	public static boolean isPrimeNumber(int number) {
		 if(number<2){
		        return false;
		    }
		  for(int i=2;i<=Math.sqrt(number);i++){
		        if(number%i==0){
		            return false;
		        }
		    }
		    return true;
	}
}
