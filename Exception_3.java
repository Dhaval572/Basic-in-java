public class Exception_3
{
	public static void main(String[] args)
	{
		try {
            String str = "Hello";
            char ch = str.charAt(10);  // Index 10 is out of bounds
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
	}
}