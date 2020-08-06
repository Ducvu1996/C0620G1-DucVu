package loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayGeometry {

	public static void main(String[] args) {
		int choice;
		do {
			Scanner input = new Scanner(System.in);
			 System.out.println("Menu");
			 System.out.println("1. Print the rectangle");
			 System.out.println("2. Print the square triangle");
			 System.out.println("3. Print isosceles triangle");
			 System.out.println("0. Exit");
			 System.out.println("Enter your choice: ");
			 choice = input.nextInt();
			switch (choice) {
		     case 1:
		    	 for(int i=0;i<3;i++) {
		    		 for(int j=0;j<7;j++) {
		    			System.out.print("*");
		    		 }
		    		 System.out.println();
		    	 }
		         break;
		     case 2:
		    	 for(int i=0;i<=5;i++) {
		    		 for(int j=0;j<i;j++) {
		    			System.out.print("*");
		    		 }
		    		 System.out.println();
		    	 }
		    	 System.out.println();
		    	 for(int i=5;i>=1;i--) {
		    		 for(int j=1;j<=i;j++) {
		    			System.out.print("*");
		    		 }
		    		 System.out.println();
		    	 }
		         break;
		     case 3:
		    	 for(int i=1;i<=5;i++) {
		    		 for(int j=1;j<=5-i;j++) {
		    			 System.out.print(" ");
		    		 }
		    		 for(int j=1;j<=2*i-1;j++) {
		    			 System.out.print("*");
		    		}
		    
		    		System.out.println();
		    	 }
		         break;
		     case 0:
		    	 System.out.println("bye bye");
		         System.exit(0);
		     default:
		         System.out.println("No choice!");
		 }

		}while(choice!= 0);
	
				 


	}

}
