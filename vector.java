import java.util.Vector;

public class vector
{
	public static void main(String[] args) {
		Vector<String> friend = new Vector<>();
		friend.add("Dhaval");
		friend.add("Manthan");
		System.out.println(friend.capacity());

		// For each loop for print elements of vector
		for(String value : friend)
		{
			System.out.println(value);
		}
	}
}