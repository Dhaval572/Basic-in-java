public class Exception_1
{
	public static void main(String[] args) 
	{
		try {
            String str = null;  // str is null
            System.out.println(str.length());  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }	
	}
}