
public class String_functions {

    public static void main(String[] args) {

        // Use of charAt()
        String example = "Hello";
        System.out.println(example.charAt(0));

        // Use of contains()
        String str = "God of war";
        System.out.println(str.contains("war"));

        // Use of format()
        String name = "Sweet heart";
        String message = String.format("Hello, %s", name);
        System.out.println(message);

        // Use of length()
        String ex = "Your ex";
        System.out.println(ex.length());

        // Use of split()
        String zassar = "Aaj hum ek game ka zeview karne wale he jiska naam he shit fire!";
        String[] charArr = zassar.split(" ");

        // Traverse character array
        for (String word : charArr) {
            System.out.print(word + " ");
        }
    }
}
