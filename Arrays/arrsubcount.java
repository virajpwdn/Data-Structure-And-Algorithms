public class arrsubcount {
    // public static void main(String[] args) {
    //     int arr[] = { 1, 2, 3, 7, 5 };
    //     int sum = 12;
    //     int count = 0;

    //     for (int i = 0; i < arr.length; i++) {
    //         int currSum = 0;
    //         for (int j = i; j < arr.length; j++) {
    //             currSum += arr[j];
    //             if(currSum == sum) count++;
    //         }
    //     }
    //     System.out.println(count);
    // }


    // *length find karni hai konse index pe sabse jadya sum ban raha hai
    public static void main(String[] args) {
        int nums[] = {1,2,1,2,7,5,5,12};
        int max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int currSum = 0;
            for (int j = i; j < nums.length; j++) {
                currSum += nums[j];

                if (currSum > max) {
                    max = currSum;
                }
            }
        }
        System.out.println(max);
    }
}
