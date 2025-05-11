// Write a program in Java demonstrate the use of “this” keyword and static keyword
public class Paper_que_1 {

    int number;               
    static int count = 0;     

    Paper_que_1(int number) {
        this.number = number; 
        count++;	              
    }

    void show() {
        System.out.println("Number: " + this.number);
        System.out.println("Object count: " + count);
    }

    public static void main(String[] args) {
        Paper_que_1 d1 = new Paper_que_1(10);
        d1.show();

        Paper_que_1 d2 = new Paper_que_1(20);
        d2.show();
    }
}