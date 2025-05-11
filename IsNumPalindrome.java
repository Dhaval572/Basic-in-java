
public class IsNumPalindrome {

    public static void main(String[] args) {
        int num = 212, rev = 0, temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(num == rev)
			System.out.print("Given number is palindrome!");
		else
			System.out.print("Given number is not palindrome");
    }
}
