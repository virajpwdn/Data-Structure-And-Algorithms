package Arrays;

public class sortedarr {
    public static void main(String[] args) {
        
        boolean check = true;
        int arr[] = {1,1,2,2,3,4,4,5};
        for(int i=1; i<arr.length; i++){
            if(arr[i] >= arr[i-1]){
                check = true;
            }else {
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}
