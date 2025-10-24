public class stringcompression {
    public static void main(String[] args) {
        String str = "abcd";
        StringBuilder sb = new StringBuilder("");
        // int j = 0;
        Integer count = 0;

        for (int i = 0; i < str.length(); i++) {
            
            count++;

            while (str.charAt(i) == str.charAt(i+1) && i < str.length()-1) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
            count = 0;
        }
        String output = sb.toString();
        System.out.println(output);
    }
}
