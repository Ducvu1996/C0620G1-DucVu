package loop_in_java.bai_tap;

public class PrimeNumber {

	public static void main(String[] args) {
		// print prime numbers less than 100
		for(int i=2;i<100;i++) {
			if(isPrimeNumber(i)==true) {
				System.out.println(i);
			}
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
