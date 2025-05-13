
class MyClass {

    int value;

    MyClass(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Value: " + value;
    }
}

public class toString_method {

    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        System.out.println(obj.toString());  // Output: Value: 10
    }
}
