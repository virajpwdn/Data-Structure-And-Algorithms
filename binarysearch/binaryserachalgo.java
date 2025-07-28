package binarysearch;

public class binaryserachalgo {
    public static int binarysearch(int arr[], int tartget){
        int left = 0;
        int right = arr.length;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if(mid == tartget){
                return mid;
            }
            if(arr[mid] > tartget){
                right = mid - 1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,8,9,12,15,18,21,25};
        int tartget = 18;

        System.out.println(binarysearch(arr, tartget));
    }
}
