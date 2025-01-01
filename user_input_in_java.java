import java.util.Scanner;

class Hello
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); // To take input from keyboard	
		
		System.out.print("Enter your name: "); 
		String name = sc.nextLine(); // Read a line of text (string)

		System.out.print("Enter your Age: "); 
		int age = sc.nextInt(); // Read an integer

		System.out.println("Hello, " + name + "! You are " + age + " years old.");

		sc.close(); // Close the sc to escape from resource leck
	}
}
/*
Explaination of user input in java:

	In java to get user inout you must import java.util.Scanner ( Line no. 1 )

	Than after create the object of Scanner class. ( Line no. 7 )

	User input methods:

		String text = scanner.nextLine();  // Reads a full line of text

		int intValue = scanner.nextInt();  // Reads an int

		long longValue = scanner.nextLong();  // Reads a long

		float floatValue = scanner.nextFloat();  // Reads a float

		double doubleValue = scanner.nextDouble();  // Reads a double

		boolean booleanValue = scanner.nextBoolean();  // Reads a boolean

		So, this was user input methods in java
*/
