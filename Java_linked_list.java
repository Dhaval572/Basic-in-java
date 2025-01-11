import java.util.LinkedList;

public class Java_linked_list
{
	public static void main(String[] args) {
		LinkedList<Integer> lst = new LinkedList<>();
		lst.add(27);
		lst.add(28);
		lst.add(29);

		// prints all elements
		for(int val : lst)
			System.out.println(val);
	}
}