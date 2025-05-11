
import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByFirstChar {

    public static void main(String[] args) {
        String[] array = {"Bstr", "Astr", "Dstr", "Cstr", "Zstr", "Estr"};

        // Sort using custom comparator based on the first character
        Arrays.sort(array, Comparator.comparingInt(s -> s.charAt(0)));
        
        for (String str : array) {
            System.out.println(str);
        }
    }
}
