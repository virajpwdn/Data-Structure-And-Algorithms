public class findcount {
    public static void main(String[] args) {
        int nums[] = {5,8,1,2,5,6,8,8,6,6,3,4,4};
        
        
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if(nums[i] != -1){
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[i] == nums[j]){
                        count++;
                        nums[j] = -1;
                    }
                }
                System.out.print(nums[i] + "element found " + count + " times found");
            }
            System.out.println();
        }
    }
}
