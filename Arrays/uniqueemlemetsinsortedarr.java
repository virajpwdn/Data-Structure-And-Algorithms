package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class uniqueemlemetsinsortedarr {
    // ! Time complexity = O(2n), space complexity = O(n);
    // ! Insted of hastset if we had used HashTreeSet then adding element time
    // complexity would have been O(n log n) because it uses red black trees to sort

    public static void bruteForce(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        int uniqueElements = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i])) {
                hs.add(arr[i]);
                arr[uniqueElements++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i])) {
                arr[uniqueElements++] = arr[i];
                hs.remove(arr[i]);
            }
        }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static void optimal(int arr[]){
        //! Time complexity = O(n)
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[j+1] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 5, 5 };
        // bruteForce(arr);
        optimal(arr);
    }
}
