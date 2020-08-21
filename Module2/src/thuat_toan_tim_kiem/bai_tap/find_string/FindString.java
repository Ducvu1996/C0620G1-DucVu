package thuat_toan_tim_kiem.bai_tap.find_string;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindString {

	public static void main(String[] args) {
		// Create a Scanner
				Scanner input = new Scanner(System.in);

				// Prompt the user to enter a string
				System.out.print("Enter a string: ");
				String string = input.nextLine(); 

				List<Character> max = new LinkedList<>();

				// Find the maximum increasingly ordered subsequence
				for (int i = 0; i < string.length(); i++) { 
					LinkedList<Character> list = new LinkedList<>();
					list.add(string.charAt(i));
					for (int j = i + 1; j < string.length(); j++) {
						if (string.charAt(j) > list.getLast()) {
							list.add(string.charAt(j)); 
						}
					}

					if (list.size() > max.size()) {
						max.clear();
						max.addAll(list);
					}
					list.clear();
				}

				// Display the maximum consecutive 
				// increasingly ordered substring
				for (Character ch: max) { // single loop
					System.out.print(ch); // Simple statement
				}
				System.out.println();
				input.close();
	}

}
