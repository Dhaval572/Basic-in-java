public class Area_of_rectangle
{
	public static float area(float radius)
	{
		final float PI = 3.14f;

		float area = PI * radius * radius;

		return area;
	}

	public static float area(float length, float width)
	{
		float area = length * width;

		return area;
	}
	public static void main(String[] args) 
	{	
		System.out.println("Area of circle is: "+ area(1));

		System.out.println("Area of rectangle is: "+area(2, 5));
	}
}