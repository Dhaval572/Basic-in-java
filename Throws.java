public class Throws {
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("You must be 18 or older!");
        }
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        try {
            checkAge(20); // Works fine
            checkAge(15); // Throws an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
