class MyRunnable implements Runnable {
	@Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Test_8 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();  // Starts the thread
    }
}
