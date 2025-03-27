public class Test_4 {
    public static void test() throws ArithmeticException {
        throw new ArithmeticException("Test exception");
    }

    public static void main(String[] args) {
        try {
            test();	
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}