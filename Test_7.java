import java.util.*;

public class Test_7
{
	public static void main(String[] args)
	{
		HashSet<Integer> hs = new HashSet<>();

		hs.add(13);  
		hs.add(14);  
		hs.add(15);  

		// for(var ele : hs)
		// {
		// 	System.out.print(ele + " ");
		// }

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Name1");
		hm.put(2, "Name2");
		hm.put(3, "Name3");

		// Iterate through HashMap
        for (Integer key : hm.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }
	}
}