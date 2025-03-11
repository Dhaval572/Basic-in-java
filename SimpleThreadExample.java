class TypingEffect extends Thread {
    private String message;

    public TypingEffect(String message) {
        this.message = message;
    } 

    @Override
    public void run() {
        try {
            for (char c : message.toCharArray()) {
                System.out.print(c);
                Thread.sleep(100); 
            }
            System.out.println(); // Next line
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class SimpleThreadExample {
    public static void main(String[] args) {
        TypingEffect thread = new TypingEffect("This is a thread example");
        thread.start();
    }
}