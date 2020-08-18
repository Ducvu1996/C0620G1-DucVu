package stack_queue.bai_tap.radix_convert;

import java.util.Stack;

public class Convert {

	Stack<Integer> stack = new Stack<>();
	public String convert(int number) {
		String result="";
		int count=0;
		do {
			stack.push(number%2);
			number=number/2;
			count++;
			}while(number>0);
		for(int i=0;i<count;i++) {
			result= result+stack.pop();
		}
		
		return result;
	}

}
