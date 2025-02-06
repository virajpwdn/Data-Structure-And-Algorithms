package Arrays;

import java.util.*;


public class intersectionarray {
    public static ArrayList<Integer> intersection(int a[], int b[]){
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = a.length, n2 = b.length;
        int newArr[] = new int[n1];
        //! Time complexity -> O(n2) & Space complexity -> O(n+n)
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n1; j++) {
                if(b[i] == a[j] && newArr[j] == 0){
                    list.add(a[j]);
                    newArr[j] = 1;
                    break;
                }
                if(a[j] > b[i]) break;
            }
        }
        System.out.println(Arrays.toString(newArr));
        return list;
    }

    public static ArrayList<Integer> optimisedIntersection(int a[], int b[]) {
        // ! TimeComplexity -> O(n)
        ArrayList<Integer> ans = new ArrayList<>();
        int n1 = a.length, n2 = b.length;
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }else if (b[j] > a[i]) {
                i++;
            }else{
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1,2,2,3,3,4,5,6};
        int b[] = {2,3,3,5,6,6,7};
        // System.out.println(intersection(a, b));
        System.out.println(optimisedIntersection(a, b));
    }
}
