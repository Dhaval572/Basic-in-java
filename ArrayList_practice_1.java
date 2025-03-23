import java.util.ArrayList;

public class ArrayList_practice_1 {

    public static int Search(ArrayList<Integer> lst, int target) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(27);
        lst.add(28);
        lst.add(29);
        lst.add(30);
        lst.add(31);

		System.out.println(Search(lst, 27));
    }
}
