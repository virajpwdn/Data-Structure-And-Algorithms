import java.util.*;

public class sets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(5);

        System.out.println(set);
        if (set.contains(5)) {
            System.out.println("5 is in the set");
        } else {
            System.out.println("5 is not in the set");
        }
        set.remove(1);
        System.out.println(set);
    }
}
