package Queue;

public class leetcode84 {
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int fMax = arr[0], sMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > fMax) {
                sMax = fMax;
                fMax = arr[i];
            }else if(arr[i] > sMax && arr[i] != fMax){
                sMax = arr[i];
            }

            // if(arr[i] > sMax && sMax < fMax){
            //     sMax = arr[i];
            // }
        }

        System.out.println("First Max is " + fMax);
        System.out.println("Secound Max is " + sMax);
    }
}
