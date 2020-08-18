package stack_queue.bai_tap.check_braket;

import java.util.Stack;

public class ParenthesisMatch {
	public static boolean isParenthes(String str) {
	    Stack<Character> stack = new Stack<>();

	    char c;
	    for(int i=0; i < str.length(); i++) {
	        c = str.charAt(i);

	        if(c == '{')
	            return false;

	        if(c == '(')
	            stack.push(c);

	        if(c == '{') {
	            stack.push(c);
	            if(c == '}')
	                if(stack.empty())
	                    return false;
	                else if(stack.peek() == '{')
	                    stack.pop();
	        }
	        else if(c == ')')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '(')
	                    stack.pop();
	                else
	                    return false;
	        }
	        return stack.empty();
	}
	
}
