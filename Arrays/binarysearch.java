package Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        int start = 0;
        int end = nums.length-1;

        // int i = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == key) {
                System.out.println("Key found");
            }

            if (nums[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            // i++;
        }
    }
}


// for (int i = 0; i < nums.length; i++) {
//     int mid = (start + end)/2;
//     if (nums[mid] == key) {
//         System.out.println("Key found at index "+i);
//     }
//     if (nums[mid] > key) {
//         end = mid - 1;
//     }else if(nums[mid]<key ){
//         start = mid + 1;
//     }
// }