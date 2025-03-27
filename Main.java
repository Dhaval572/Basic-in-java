
public class Main {

    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index out of range.");
        }
    }
}
