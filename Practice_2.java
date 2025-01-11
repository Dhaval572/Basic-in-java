import java.util.Scanner;

public class Practice_2
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scanner.nextLine();

		// Remove spaces and convert to lowercase for case-insensitive comparison
		str = str.replace("//s", "").toLowerCase();

		String reversed = new StringBuilder(str).reverse().toString();

		if(str.equals(reversed))
		{
			System.out.println("The string is a palindrome.");
		}
		else
		{
			System.out.println("The string is not a palindrome.");
		}
	}
}