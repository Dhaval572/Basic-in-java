public class Practice_6
{
	public static void sumOfDigit(int n)
	{
		int sum = 0, rem;
		while(n != 0)
		{
			rem = n % 10;	// Gives last digit
			sum += rem;		// Add digit with sum
			n /= 10;		// Update the number
		}

		System.out.println("Sum of digit is: "+sum);
	}
	public static void main(String args[])
	{
		sumOfDigit(1234);
	}
}