public class WrapperClasses
{
	public static int objectToPrimitive(Integer obj)
	{
		return obj;
	}

	public static Integer primitiveToObject(int value)
	{
		return value;
	}

	public static void main(String[] args)
	{
		Integer obj = 42;
        int primitive = objectToPrimitive(obj);
        System.out.println("Primitive: " + primitive);

        int val = 100;
        Integer boxed = primitiveToObject(val);
        System.out.println("Object: " + boxed);
	}
}