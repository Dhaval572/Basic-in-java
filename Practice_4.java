// Factorial of number using recursion
public class Practice_4
{
	public static int factoral(int n)
	{
		if(n == 0 || n == 1)
			return 1;
		
		else return n* factoral(n - 1);
	}
	public static void main(String[] args) 
	{
		int num = 5;
		System.out.print("Factorial of "+num+ " is: "+factoral(num));
	}
}