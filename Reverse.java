
public class Reverse {

    public static void main(String[] args) {
        int num = 123;
        int digit, reverse = 0;
        while(num != 0)
        {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.print("Now 123 is: "+reverse);
    }
}
