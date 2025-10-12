package recursion;

public class findduplicate {
    public static void main(String[] args) {
        boolean bitMap[] = new boolean[26];
        String str = "appnnacolleggee";
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(bitMap[ch - 'a'] == false){
                sb.append(ch);
                bitMap[ch-'a'] = true;
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i) + " ");
        }
        System.out.println();
        
    }
}
