package stack_queue.bai_tap.palindrome;

import java.util.Stack;

public class Palindrome {
	Stack<Character> stack = new Stack<>();
	public boolean checkPalindrome(String str) {
		String newStr="";
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		for(int i=0;i<str.length();i++) {
			newStr+=stack.pop();
		}
		System.out.println(newStr);
		if(str.equalsIgnoreCase(newStr)) {
			return true;
		}else {
			return false;
		}
	} 
}
