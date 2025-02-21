public class Exception_2
{
	public static void main(String[] args)
	{
		try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[10]);  // Trying to access index 10 (out of bounds)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
	}
}