package stack_queue.bai_tap.reverse_by_stack;

import java.util.Stack;



public class ReverseArray {
	int[] array = new int[5];
	Stack<Integer> stack = new Stack<>();
	 
	public ReverseArray(int[] array) {
		this.array = array;
		
	}
	public void getOut() {		  
		for(int i=0;i<array.length;i++) {
			 stack.push(array[i]);
		}
	}
	public int[] getIn() {
		for(int i=0;i<array.length;i++) {
			array[i]= stack.pop();
		  }
		return array;
	}
}
