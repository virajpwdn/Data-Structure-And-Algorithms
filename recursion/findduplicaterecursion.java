package recursion;

public class findduplicaterecursion {

    public static void findDup(String str, boolean bitMap[], StringBuilder sb, int i){
        if(i == str.length()){
            System.out.println(sb);
            return;
        }

        char ch = str.charAt(i);
        if(bitMap[ch - 'a'] == false){
            sb.append(ch + " ");
            bitMap[ch - 'a'] = true;
        }

        findDup(str, bitMap, sb, i+1);
    }

    public static void main(String[] args) {
        String str = "appnnacolleggee";
        StringBuilder sb = new StringBuilder("");
        boolean bitMap[] = new boolean[26];
        int i =0;
        findDup(str, bitMap, sb, i);
    }
}
