import java.util.HashMap;

public class anagrams {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();
        String str = "tulip";
        String str2 = "lipid";
        Boolean check;
        int count = 0;

        if (str.length() != str2.length()) {
            check = false;
        }else{
            for (int i = 0; i < str.length(); i++) {
                char word = str.charAt(i);
                hm.put(word, hm.getOrDefault(word, 0) + 1);
            }
        }
        
        for (int i = 0; i < str2.length(); i++) {
            char word = str2.charAt(i);
            if (!hm.containsKey(word)) {
                count++;
            }
        }

        if (count > 0) {
            check = false;
        } else {
            check = true;
        }
        System.out.println(check);
    }
}
