package string_regex.bai_tap.phone_number_validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	private static final String PHONE_NUMBER_REGEX = "^[(]{1}[0-9]{2}[)]{1}[-]{1}[(]{1}[0]{1}[0-9]{9}[)]{1}$";
	public static boolean validate(String regex) {
		Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
		Matcher  matcher = pattern.matcher(regex);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String phone_number;
		do {
			System.out.println("input a phone number:");
			phone_number = scanner.nextLine();
			 if(validate(phone_number)) {
				System.out.println(phone_number+" correct");
			}else {
				System.out.println(phone_number+ " incorrect");
			}
				
		}while(!validate(phone_number));
		
		scanner.close();
	}
}
