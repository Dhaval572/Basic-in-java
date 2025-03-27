
class Test extends Thread {

    @Override
    public void run() {
        System.out.println("Hello");
    }
}

class Test0 extends Thread {

    @Override
    public void run() {
        System.out.println("World!");
    }
}

class Test1 extends Thread {

    @Override
    public void run() {
        System.out.println("How");
    }
}

public class Test_3 {

    public static void main(String[] args) {
        Test test = new Test();
        Test0 test0 = new Test0();
        Test1 test1 = new Test1();
        test.start();
        test0.start();
		test1.start();
    }
}
