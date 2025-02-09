class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void greet(Person other) {  // Object as a parameter
        System.out.println("Hello " + other.name + ", I am " + this.name);
    }
}

public class Object_as_args {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");

        p1.greet(p2);  // Passing object p2 as a parameter
    }
}
