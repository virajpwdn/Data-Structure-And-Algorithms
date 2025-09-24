import java.util.Arrays;
import java.util.Stack;

public class infix2prefix {

    public static String reverse(String str){
        char newArr[] = str.toCharArray();
        int i = 0, j = newArr.length-1;

        while (i<j) {
            char temp = newArr[i];
            newArr[i] = newArr[j];
            newArr[j] = temp;
            i++;
            j--;
        }
        // System.out.println(Arrays.toString(newArr));
        for(int k=0; k<newArr.length; k++){
            if(newArr[k] == '('){
                newArr[k] = ')';
            }
            if(newArr[k] == ')'){
                newArr[k] = '(';
            }
        }
        System.out.println(newArr);
        str = new String(newArr);
        return str;
    }

    public static int priority(char ch){
        if(ch == '^') return 3;
        if(ch == '*' || ch == '/') return 2;
        if(ch == '+' || ch == '-') return 1;
        return -1;
    }

    public static String conversionInfix2Prefix(String str){
        // 1. To convert Infix to Prefix first reverse the given string while preserving the brackets
        // 2. Convert Infix to PostFix means reversed string to PostFix -> Follow its steps
        // 3. Return the Reversed ans

        String rStr = reverse(str);
        Stack <Character> sk = new Stack<>();
        StringBuilder ans = new StringBuilder("");

        for (int i = 0; i < rStr.length(); i++) {
            char ch = rStr.charAt(i);
            if (ch == '^' || ch == '*' || ch == '/' || ch == '+' || ch == '-') {
                if(sk.isEmpty()) sk.push(ch);
                else {
                    if(priority(sk.peek()) < priority(ch)){
                        sk.push(ch);
                    }else {
                        if(ch == '^'){
                            while (!sk.isEmpty() && priority(sk.peek()) <= priority(ch)) {
                                ans.append((sk.peek()));
                                sk.pop();
                            }
                            sk.push(ch);
                        }else {
                            while (!sk.isEmpty() && priority(sk.peek()) > priority(ch)) {
                                ans.append((sk.peek()));
                                sk.pop();
                            }
                            sk.push(ch);
                        }
                    }
                }
            }else if(ch == '('){
                sk.push(ch);
            }else if(ch == ')') {
                while (!sk.isEmpty() && sk.peek() != '(') {
                    ans.append(sk.peek());
                    sk.pop();
                }
                sk.pop();
            } else{
                ans.append(ch);
            }
        }

        while (!sk.isEmpty()) {
            ans.append(sk.peek());
            sk.pop();
        }

        str = ans.toString();
        reverse(str);
        return str;
    }

    public static void main(String[] args) {
        String str = "(A+B)*C-D+F";
        conversionInfix2Prefix(str);
        System.out.println(conversionInfix2Prefix(str));
    }
}