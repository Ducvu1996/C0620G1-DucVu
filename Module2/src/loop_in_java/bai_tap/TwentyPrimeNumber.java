package loop_in_java.bai_tap;

public class TwentyPrimeNumber {

	public static void main(String[] args) {
		// print 20 prime number
		int count=0;
		int i=2;
		while(count<20) {
		
			if(isPrimeNumber(i)==true) {
				System.out.println(i);	
				count++ ;
			}
			i++;
		}
	}
	// function which check the prime number
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
