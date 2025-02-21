public class Exception
{  
    public static void main(String[] args) 
	{
        try 
		{
			// Which code is expects errors write here
            int a = 10, b = 0;
            int result = a / b;  
            System.out.println("Result: " + result);
        } 
		catch (ArithmeticException e) 
		{  
            System.out.println("Exception caught: " + e.getMessage());
        }
		finally 
		{  
            System.out.println("This block always executes.");
        }
    }
}