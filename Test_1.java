import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;

public class Test_1 {
    public static void main(String[] args) {
        
        // ArrayList implementation
        ArrayList<Integer> arrlst = new ArrayList<>();
        arrlst.add(12);
        arrlst.add(13);
        arrlst.add(14);

        System.out.print("ArrayList: ");
        for (var ele : arrlst) {
            System.out.print(ele + " ");
        }
        System.out.println(); 

        // LinkedList implementation
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Banana");
        ls.add("Apple");
        ls.add("Orange");

        System.out.print("LinkedList: ");
        for (var ele : ls) {
            System.out.print(ele + " ");
        }
        System.out.println(); 

        // HashSet implementation
        HashSet<String> hs = new HashSet<>();
        hs.add("Dahod");
        hs.add("Surat");
        hs.add("Rajkot");
        hs.add("Rajkot"); // Does not allow duplicate elements

        System.out.print("HashSet: ");
        for (var ele : hs) {
            System.out.print(ele + " ");
        }
        System.out.println(); 
    }
}
