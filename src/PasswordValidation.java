import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a password.");
		System.out.println("Password must contain the following:");
		System.out.println("- Between 7 and 12 characters");
		System.out.println("- At least one lowercase letter and at least one uppercase letter");
		System.out.println("- At least one exclamation point: !");
		String pw = scnr.nextLine(); //pw for password
		
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!]).{7,12}$";
		boolean validPassword = isValidPassword(pw,regex);
		if (validPassword) {
			System.out.println("Password is valid and accepted");
		} else {
			System.out.println("Error");
		}
	}
	
	public static boolean isValidPassword(String pw,String regex)
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pw);
		return matcher.matches();
	}
}