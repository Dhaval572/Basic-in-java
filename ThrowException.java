public class ThrowException {
    static void invalidArgs(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        invalidArgs(13); 
        invalidArgs(-5); 
    }
}
