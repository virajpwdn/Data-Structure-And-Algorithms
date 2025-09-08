import java.util.HashMap;
import java.util.HashSet;

public class unionandintersection {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        // HashMap <Integer, Integer> hm = new HashMap<>();
        HashSet <Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        int unionSize = set.size();
        System.out.println("union elements "+set);
        // System.out.println(unionSize);
        set.clear();
        
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        StringBuilder sb = new StringBuilder();
        int intersectionCount = 0;
        for (int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])){
                intersectionCount++;
                sb.append(arr2[i] + " ");
                set.remove(arr2[i]);
            }
        }
        System.out.println(sb);
        // System.out.println(intersectionCount + " " + unionSize);

    }
}
