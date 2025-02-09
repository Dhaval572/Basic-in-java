public class Label {
    public static void main(String[] args) {
        myLabel: 
        {
            System.out.println("Before break");
            if (true) {
                break myLabel;
            }
            System.out.println("This will not be printed");
        }
        System.out.println("After the labeled block");
    }
}