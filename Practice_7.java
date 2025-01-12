// Print string in reverse
public class Practice_7
{
	public static void reverse(String s)
	{
		for(int i = (s.length() - 1); i >= 0; i--)
			System.out.print(s.charAt(i));
	}
	public static void main(String args[])
	{
		reverse("Dhaval");
	}
}