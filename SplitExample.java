public class SplitExample {
    public static void main(String[] args) {
        String text = "Kitkat, Dairy milk, Perk, munch";

        // Splitting using a comma as a delimiter
        String[] Chocolates = text.split(", ");

        for (String Chocolate : Chocolates) {
            System.out.println(Chocolate);
        }
    }
}
