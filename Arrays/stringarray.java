package Arrays;

public class stringarray {

    public static int findFruits(String[] fruits, String key){
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana", "strawberry"};
        String key = "strawberry";
        int index = findFruits(fruits, key);
        System.out.println(index);
    }
}
