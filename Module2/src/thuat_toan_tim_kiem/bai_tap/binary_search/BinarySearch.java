package thuat_toan_tim_kiem.bai_tap.binary_search;

public class BinarySearch {

	public static int binarySearch(int[] array, int low,int hight, int key) {
	
		if (hight >= low) {
		      int mid = low + (hight - low) / 2;
		 
		      if (array[mid]==key) {
		    	  return mid;
		 		}	
		      if (array[mid] >key) {
		    	   return binarySearch(array, low, mid - 1, key);
		      }else {
		      return binarySearch(array, mid + 1, hight, key);
		      }
		    }
		    return -1;
	}

	public static void main(String[] args) {
		
		    int arr[] = {1,2,3,4,5,6,7,8,9,10};
		    int x = 1;
		    int result = binarySearch(arr, 0, arr.length - 1, x);
		    if (result == -1)
		      System.out.println("Không tìm thấy phần tử " + x);
		    else
		      System.out.println("Phần tử " + x + " được tìm thấy tại chỉ số " +result);
		  }
	
}
