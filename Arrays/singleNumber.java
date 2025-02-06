package Arrays;

public class singleNumber {
    public static int findSingleNum(int nums[]){
        int maxi = 0;
        for(Integer num:nums){
            if(num > maxi){
                maxi = num;
            }
        }

        int hashArr[] = new int[maxi + 1];
        for(Integer num:nums){
            hashArr[num]++;
        }


        for(int i=0; i<hashArr.length; i++){
            if(hashArr[i] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,1,2,4};
        System.out.println(findSingleNum(nums));
    }
}