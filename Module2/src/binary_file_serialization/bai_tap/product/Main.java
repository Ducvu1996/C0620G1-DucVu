package binary_file_serialization.bai_tap.product;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		Product product = new Product();
		
		int choose ;
	    boolean exit = false;
	    product.menu();
		
	   while (true) {
           choose = scanner.nextInt();
            switch (choose) {
            case 1:
            	product.addProduct();
                break;
            case 2:
            	product.showProducts();
                break;
            case 3:
            	System.out.println("input name of product that you wanna find:");
            	scanner.skip("\\R");
            	String nameProduct= scanner.nextLine();
            	product.searchProduct(nameProduct);
                break;
            case 0:
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            // show menu
            product.menu();
	   }
	}
}
