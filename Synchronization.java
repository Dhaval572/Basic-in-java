
class Counter {

    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class Synchronization {

    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(c::increment);
        Thread t2 = new Thread(c::increment);

        t1.start();
        t2.start();

        try {
            
            t1.join();
            t2.join();
        
        } catch (InterruptedException e) {}

        System.out.println("Final Count: " + c.count);
    }
}
