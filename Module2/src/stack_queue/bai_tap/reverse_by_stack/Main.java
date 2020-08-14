package stack_queue.bai_tap.reverse_by_stack;



public class Main {
	  public static void main(String[] args) {
		  int[] array = {1,2,3,4,5};
		  String str="AnhYeuEm";
		 // MyGenericStack<Integer> stack = new MyGenericStack();
			ReverseArray reverse = new ReverseArray(array);
			reverse.getOut();
			reverse.getIn();
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}
			
			//String
			ReverseString reverseString  = new ReverseString(str);
			reverseString.getOut();
			System.out.println(reverseString.getIn());
			
			}
}
