public class String_class
{
	public static void main(String[] args) 
	{
		String s = "Hello world";
		
		// Use of length and charAt function
		for(int i = 0; i < s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}

		if(s.contains("e"))
		{
			System.out.println("e is available in String class");
		}

		// Use of split()
		String[] words = s.split(" ");

		for(String word : words)
		{
			System.out.println(word);
		}

		String str = "Prince";
		int age = 23;

		// Use of format function
		String msg = String.format("My name is %s and I am %d years old.", str, age);

		System.out.println(msg);

	}
}