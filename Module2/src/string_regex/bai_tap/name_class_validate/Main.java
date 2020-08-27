package string_regex.bai_tap.name_class_validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	private static final String CLASS_NAME_REGEX = "^[CAP]{1}[0-9]{4}[GHIKLM]{1}$";
	public static boolean validate(String regex) {
		Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
		Matcher  matcher = pattern.matcher(regex);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String class_name;
		do {
			System.out.println("input a account:");
			 class_name = scanner.nextLine();
			 if(validate(class_name)) {
				System.out.println(class_name+" correct");
			}else {
				System.out.println(class_name+ " incorrect");
			}
				
		}while(!validate(class_name));
		
		scanner.close();
	}

}
