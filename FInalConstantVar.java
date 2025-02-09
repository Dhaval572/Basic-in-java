class Circle
{
	static final float PI = 3.14f;

	static float area(float radius)
	{
		return PI * radius * radius;	
	}
}

public class FInalConstantVar
{
	public static void main(String[] args)
	{
		Circle circle = new Circle();
		System.out.print(circle.area(1));
	}
}