class ThreadTest extends Thread {
    @Override
    public void run() {
        System.out.print("Thread is running ... ");
    }
}

public class ThreadExample { 
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start(); 
    }
}
