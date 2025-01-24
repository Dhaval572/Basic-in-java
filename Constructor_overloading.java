class OverLoading
{
	int a;
	public OverLoading()
	{
		a = 0;		
		System.out.println("A = "+ a);
	}

	public OverLoading(int a)
	{
		this.a = a;
		System.out.println("A = "+ a);
	}

	// To use object
	public void xyz(){}
}

public class Constructor_overloading
{
	public static void main(String args[])
	{
		OverLoading overLoading = new OverLoading();
		overLoading.xyz();
	}
}