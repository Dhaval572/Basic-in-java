class A
{
	public int a = 40;
}

class B extends A
{
	B()
	{
		System.out.print("A = " + a);
	}

	void ignore(){}
}

public class Simple_example
{
	public static void main(String[] args)
	{
		B b = new B();
		b.ignore();
	}
}