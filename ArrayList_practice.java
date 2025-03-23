import java.util.ArrayList;

public class ArrayList_practice
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(1);
		arr.add(2);
		arr.add(3);

		arr.remove(1);

		System.out.println(arr);

		arr.add(1, 35);
		System.out.println(arr);
	}
}