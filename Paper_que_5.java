/* Write a program that executes two threads. One thread will print the even
numbers and another thread will print odd numbers from 1 to 100. */

class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class Thread2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 99; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class Paper_que_5 {

    public static void main(String[] args) {
        Thread1 evenThread = new Thread1();
        Thread2 oddThread = new Thread2();

        evenThread.start();
        oddThread.start();
    }
}
