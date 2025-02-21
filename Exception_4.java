public class Exception_4 
{
	public static void setAge(int age) 
	{
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative!");
		}
		System.out.println("Age set to: " + age);
	}

    public static void main(String[] args) 
	{
        try {
            setAge(-5); // Passing an invalid age
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}