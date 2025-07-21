package Arrays;
// sum of n = n*(n+1)/2

public class subarrays {
    public static void main(String[] args) {
        int nums[] = { 1,-2,6,-1,3 };
        int tp = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print("(" + nums[j2] + ") ");
                    sum += nums[j2];
                }
                max = Math.max(max, sum);
                min = Math.min(min, sum);
                System.out.print(sum);
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maxium sum is " + max);
        System.out.println("Minimum sum is " + min);
    }
}
