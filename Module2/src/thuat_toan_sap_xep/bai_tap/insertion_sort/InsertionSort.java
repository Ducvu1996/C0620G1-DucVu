package thuat_toan_sap_xep.bai_tap.insertion_sort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
        
        System.out.print("Your list after sorting: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        scanner.close();
  
	}
	public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; ++i) { 
            int key = list[i]; 
            int j = i - 1; 
            while (j >= 0 && list[j] > key) { 
            	list[j + 1] = list[j]; 
                j = j - 1; 
            } 
            list[j + 1] = key; 
        } 
	}

}
