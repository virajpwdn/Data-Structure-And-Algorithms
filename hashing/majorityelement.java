import java.util.HashMap;
import java.util.Set;

public class majorityelement {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        int n = arr.length / 3;
        
        //! check its dry run on gpt
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1); 
        }

        // Set<Integer> keypairs = hm.keySet();
        for (Integer key : hm.keySet()) {
            if (hm.get(key) > n) {
                System.out.println(key);
            }
        }
        System.out.println(hm);
    }
}
