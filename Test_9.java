import java.util.*;

public class Test_9
{
	public static void main(String[] args)
	{
		// LinkedList<Integer> lst =  new LinkedList<>();

		// lst.add(14);
		// lst.add(15);
		// lst.add(16);

		// // for(var ele : lst)
		// // 	System.out.print(ele + " ");

		// lst.removeLast();

		
		// for(var ele : lst)
		// 	System.out.print(ele + " ");

		HashSet<Integer> hs = new HashSet<>();

		hs.add(23);
		hs.add(24);
		hs.add(25);
		hs.add(26);
		hs.add(27);

		for(var ele : hs) System.out.print(ele + " ");

		hs.remove(23);


		for(var ele : hs) System.out.print(ele + " ");	
	}
}