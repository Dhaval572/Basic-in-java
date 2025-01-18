class Base
{	
	Base()
	{
		System.out.println("Base class Constructure");
	}
}

class Derived extends Base
{
	Derived()
	{
		System.out.println("Derived class Constructure");
	}

	// To remove waste use error
	void xyz()
	{
		
	}
}

public class More_in_constructure
{
	public static void main(String[] args) 
	{
		Derived derived = new Derived();
		derived.xyz();
	}
}