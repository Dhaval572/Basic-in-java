// Write a program in Java to demonstrate the constructor overloading
public class Paper_que_2 {
    String name;
    int age;

    // Constructor 1: No arguments
    Paper_que_2() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2: One argument
    Paper_que_2(String n) {
        name = n;
        age = 0;
    }

    // Constructor 3: Two arguments
    Paper_que_2(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Paper_que_2 p1 = new Paper_que_2();               
        Paper_que_2 p2 = new Paper_que_2("Alice");        
        Paper_que_2 p3 = new Paper_que_2("Bob", 25);      

        p1.display();
        p2.display();
        p3.display();
    }
}
