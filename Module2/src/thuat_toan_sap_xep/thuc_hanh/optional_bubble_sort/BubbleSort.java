package thuat_toan_sap_xep.thuc_hanh.optional_bubble_sort;

public class BubbleSort {
	static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
	public static void bubbleSort(int[] list) {
		
		for (int i= 0; i< list.length; i++){
			for(int j = i+1; j < list.length; j++){
				if(list[i] > list[j]){
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	 }
	public static void main(String[] args) {
	    bubbleSort(list);
	     for (int i = 0; i < list.length; i++)
	         System.out.print(list[i] + " ");

	}

}
