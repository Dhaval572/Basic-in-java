public class WrapperClasses
{
	public static void main(String[] args)
	{
		int num = 10;
		Integer obj = num;
		int value = obj;

		System.out.println("Wrapper Object: " + obj);
        System.out.println("Primitive Value: " + value);
	}
}