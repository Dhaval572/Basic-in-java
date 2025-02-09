public class MethodOverloading
{
	int add(int a, int b)
	{
		return a + b;
	}

	int add(int a, int b, int c)
	{
		return a + b + c;
	}

	public static void main(String[] args)
	{
		MethodOverloading obj = new MethodOverloading();

		System.out.println("20 + 30 = "+obj.add(20, 30)); 
		System.out.print("20 + 30 + 40 = "+obj.add(20, 30, 40));
	}
}