package stack_queue.bai_tap.reverse_by_stack;

import java.util.Stack;



public class ReverseString {
	String str="";
	Stack<Character> stack = new Stack<>();
	
	public ReverseString(String str) {
		
		this.str = str;
	
	}
	public void getOut() {		  
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
	}
	public String getIn() {		  
		
		String newStr="";
		for(int i=0;i<str.length();i++) {
			newStr+=stack.pop();
		}
		return newStr;
	}
}
