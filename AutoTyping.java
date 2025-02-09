public class AutoTyping {
    public static void main(String[] args) {
        String s = "I'll stay so deep inside your brain!";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));  // Use charAt() instead of at()
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}
