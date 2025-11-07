package recursion;

public class findoccurence {
    public static void isOccur(int arr[], int i, int key){
        if(i == arr.length){
            System.out.println("Key not found");
            return;
        }
        
        isOccur(arr, i+1, key);

        if (arr[i] == key) {
            System.out.println("key found at index : " + i);
            return;
        }

        // System.out.println("Hello");
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 3;
        int i = 0;
        isOccur(arr, i, key);
    }
}
