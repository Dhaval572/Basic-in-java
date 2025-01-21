import java.util.ArrayList;

public class Unique_list
{
	public static ArrayList<Integer> addUniqueElement(ArrayList<Integer> list)
	{
		// New list to add unique elements
		ArrayList<Integer> uniqueList = new ArrayList<>(); 

		for(int val : list)
		{
			if(!uniqueList.contains(val))
			{
				uniqueList.add(val);
			}
		}

		return uniqueList;
	}


	public static void printList(ArrayList<Integer> list)
	{
		System.out.print("Elements of list is: ");
		for(int val : list)
		{
			System.out.print(val+" ");
		}
	}

	public static void main(String args[])
	{
		ArrayList<Integer> oldList = new ArrayList<>();

		oldList.add(1);
		oldList.add(2);
		oldList.add(2);
		oldList.add(3);
		oldList.add(4);
		oldList.add(3);
		oldList.add(5);

		System.out.println("Old list element: ");
		printList(oldList);

		System.out.println();

		System.out.println("New list element: ");
		printList(addUniqueElement(oldList));
	}
}