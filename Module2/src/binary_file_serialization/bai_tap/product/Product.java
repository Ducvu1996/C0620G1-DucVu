package binary_file_serialization.bai_tap.product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Product {
	
	public static Scanner scanner = new Scanner(System.in);
	public static File file = new File("product.txt");
	public  void searchProduct(String nameProduct) throws IOException {
		FileReader fileReader=  new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String line= null;
		boolean check = false;
		while(( line= reader.readLine()) != null) {
			String[] product= line.split(",");
			if(product[1].equals(nameProduct)) {
				System.out.println("product:"+product[1]+"\t price"+product[3]);
				check=true;
				break;
			}
			
	
		}
		if(check==false) System.out.println("nothing was found");
	
		reader.close();
		
	}
	public  void showProducts() throws IOException,ArrayIndexOutOfBoundsException {
		FileReader fileReader=  new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String line =null;
		while((line=reader.readLine())!=null) {
			String[] product=line.split(",");
			System.out.println("code: "+product[0]+"\t\t"
					+ "name:"+product[1]+"\t\t"+
								"company :"+product[2]+"\t\t"+
								"price: "+ product[3]+"\t\t"+
								"country:"+product[4]);
			
		}
		reader.close();
	}
	public void addProduct() throws IOException {
		FileWriter fileWriter = new FileWriter(file,true);
		BufferedWriter writer = new BufferedWriter(fileWriter);
		String[] product=new String[5];
	
		System.out.println("input the code of product:");
		product[0]= scanner.nextLine();
		System.out.println("input the name of product:");
		product[1]= scanner.nextLine();
		System.out.println("input the company :");
		product[2]= scanner.nextLine();
		System.out.println("input the price :");
		product[3]= scanner.nextLine();
		System.out.println("input the country :");
		product[4]= scanner.nextLine();
		String line=product[0]+","+product[1]+","+product[2]+","+product[3]+","+product[4]+"\n";
		writer.write(line);
	
		writer.close();

		
	}
	public  void menu() {
		System.out.println("======================"
				+ "Input a choice \n"
				+ "1. Add a new product\n"
				+ "2. Show all products\n"
				+ "3. Search a product by name\n"
				+ "0. Exit\n"
				+ "input your choice: ");

	}

}
