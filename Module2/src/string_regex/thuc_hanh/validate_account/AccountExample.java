package string_regex.thuc_hanh.validate_account;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;


public class AccountExample {
	private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
	public static boolean validate(String regex) {
		Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
		Matcher  matcher = pattern.matcher(regex);
		return matcher.matches();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String account;
		do {
			System.out.println("input a class's name:");
			account = scanner.nextLine();
			 if(validate(account)) {
				System.out.println(account+" correct");
			}else {
				System.out.println(account+ " incorrect");
			}
				
		}while(!validate(account));
		
		scanner.close();
	}
}
