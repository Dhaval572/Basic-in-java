public class Loading {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Loading");
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            Thread.sleep(500); // Pause for 0.5 seconds
        }
        System.out.println("\nDone!");
    }
}