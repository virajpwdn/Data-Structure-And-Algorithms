import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 }; // Fix 1: Correct array initialization
        List<List<Integer>> result = subSet(arr);
        System.out.println(result);
    }

    public static List<List<Integer>> subSet(int[] arr) {
        // Fix 2: Return type List<List<Integer>>
        List<List<Integer>> result = new ArrayList<>();
        backTracking(arr, new ArrayList<>(), 0, result); // Fix 3: Pass arr, use ArrayList not []
        return result; // Fix 4: Added missing return statement
    }

    public static void backTracking(
        int[] arr,
        List<Integer> path,
        int start,
        List<List<Integer>> result
    ) {
        result.add(new ArrayList<>(path)); // Fix 5: Use add() and copy path properly
        for (int i = start; i < arr.length; i++) {
            // Fix 6: Added the loop logic to recurse
            path.add(arr[i]);
            backTracking(arr, path, i + 1, result);
            path.remove(path.size() - 1); // Backtrack
        }
    }
}
