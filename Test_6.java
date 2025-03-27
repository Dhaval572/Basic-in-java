class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is RUNNING...");

            // Move to TIMED_WAITING state using sleep
            System.out.println(Thread.currentThread().getName() + " is going to sleep...");
            Thread.sleep(2000);  // TIMED_WAITING state

            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " is WAITING...");
                wait();  // Moves to WAITING state
            }

            System.out.println(Thread.currentThread().getName() + " is RESUMED and RUNNING again...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " is TERMINATED.");
    }
}

public class Test_6 {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();  // NEW state
        System.out.println("Thread created but not started (NEW State).");

        t1.start();  // Moves to RUNNABLE state
        System.out.println("Thread started (RUNNABLE State).");

        try {
            Thread.sleep(1000);  // Ensure thread is running
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (t1) {
            System.out.println("Main thread waking up MyThread...");
            t1.notify();  // Moves thread from WAITING to RUNNABLE
        }

        try {
            t1.join();  // Main thread waits for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread execution completed (TERMINATED State).");
    }
}
