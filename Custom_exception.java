import java.lang.Exception;

class CustomEx extends Exception {

    public CustomEx(String message) {
        super(message);
    }
}

public class Custom_exception {

    public static void main(String[] args) {
        try {
            throw new CustomEx("This is a custom exception");
        } catch (CustomEx e) {
            System.out.println(e.getMessage());
        }
    }
}