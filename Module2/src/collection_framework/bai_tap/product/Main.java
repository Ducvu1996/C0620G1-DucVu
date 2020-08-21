package collection_framework.bai_tap.product;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int choose ;
	    boolean exit = false;
		ProductManager mobile = new ProductManager();
		int Id;
		showMenu();
		
	   while (true) {
           choose = scanner.nextInt();
            switch (choose) {
            case 1:
            	mobile.add();
                break;
            case 2:
                Id = mobile.inputId();
                mobile.edit(Id);
                break;
            case 3:
            	Id = mobile.inputId();
            	mobile.delete(Id);
                break;
            case 4:
            	mobile.sortByPrice();
            	mobile.show();
                break;
            case 5:
            	mobile.show();
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
            showMenu();
        }

	}
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add product.");
        System.out.println("2. Edit product by id.");
        System.out.println("3. Delete product by id.");
        System.out.println("4. Sort product by price.");
        System.out.println("5. Show product.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
