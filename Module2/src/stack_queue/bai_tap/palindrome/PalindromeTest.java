package stack_queue.bai_tap.palindrome;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		String str="";
		Scanner scanner= new Scanner(System.in);
		System.out.println("input a String : ");
		str= scanner.nextLine();
		Palindrome palindrome = new Palindrome();
		if(palindrome.checkPalindrome(str)==true) {
			System.out.println("The input String is a Palindrome String");
		}else {
			System.out.println("The input String is not a Palindrome String");
		}
		
		scanner.close();
	}

}
