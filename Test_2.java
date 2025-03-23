import java.util.HashMap;

public class Test_2
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> nameEno = new HashMap<>();

		nameEno.put("Dhaval", 147);
		nameEno.put("Manthan", 150);
		nameEno.put("Dhruvil", 148);

		System.out.println("HashMap Elements:");
        for (var entry : nameEno.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Enrollment: " + entry.getValue());
        }
	}
}