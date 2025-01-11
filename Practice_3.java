// Sum of even numbers
import java.util.Scanner;

public class Practice_3
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int n = scanner.nextInt();

		int sum = 0;
		for(int i = 2; i <= n; i += 2)
		{
			sum += i;
		}

		System.out.println("Sum of even numbers from 1 to "+ n +" is: " + sum);
	}
}