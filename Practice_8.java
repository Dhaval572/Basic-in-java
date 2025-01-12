
public class Practice_8 
{
    public static int fibonacci(int n) 
	{
        if (n <= 1) 
		{
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) 
	{
        System.out.println("Fibonacci series up to " + 5 + " terms:");
        for (int i = 0; i < 5; i++) 
		{
            System.out.print(fibonacci(i) + " "); // Print each Fibonacci number
        }
    }
}
