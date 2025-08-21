import java.util.HashMap;
import java.util.Set;

public class hashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        Set<String> keys = hm.keySet();

        hm.put("India", 10000);
        hm.put("USA", 90000);
        hm.put("London", 800000);
        hm.put("Norway", 500000);

        // System.out.println(hm);
        // System.out.println(hm.containsKey("America"));
        // System.out.println(hm.get("USA"));
        // System.out.println(hm.remove("London"));

        // hm.clear();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println(hm.entrySet());
        }
    }
}