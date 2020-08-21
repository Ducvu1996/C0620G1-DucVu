package collection_framework.bai_tap.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ProductManager  {
	List<Product> productList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	public void add() {
		String nameProduct = inputName();
		int id = inputId();
		int price = inputPrice();
		 Product product = new Product(nameProduct,id,price);
		 productList.add(product);

	}
	
	public void edit(int id) {
	    boolean isExisted = false;
		int size = productList.size();
        for (int i = 0; i < size; i++) {
            if (productList.get(i).getId() == id) {
            	isExisted = true;
                productList.get(i).setNameProduct(inputName());
                productList.get(i).setId(inputId());
                productList.get(i).setPrice(inputPrice());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        }
	}
	public void delete(int id) {
		Product product = null;
        int size = productList.size();
        for (int i = 0; i < size; i++) {
            if (productList.get(i).getId() == id) {
            	product = productList.get(i);
                break;
            }
        }
        if (product != null) {
        	productList.remove(product);
            
        }else {
        	  System.out.printf("id = %d not existed.\n", id);
        }
	}
	
	public void show() {
	   for (Product product : productList) {
            System.out.println( product.getId());
            System.out.println( product.getNameProduct());
            System.out.println( product.getPrice());
        }
	}
	public void search() {
		
	}
	public void sortByPrice() {
		 Collections.sort(productList, new SortProductByPrice());
	}
	public String inputName() {
		 System.out.println("input product's name:");
		 String nameProduct= scanner.nextLine();
		 return nameProduct;
	}
	public int inputId() {
		System.out.println("input product's id:");
		int id= scanner.nextInt();
		return id;
	}
	public int inputPrice() {
		 System.out.println("input product's price:");
		 int price= scanner.nextInt();
		 scanner.skip("\\R");
		 return price;
	}


	
}
