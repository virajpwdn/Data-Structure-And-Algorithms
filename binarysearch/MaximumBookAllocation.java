public class MaximumBookAllocation {

    public static int funCountStu(int arr[], int pages){
        int student = 1;
        int pagesStudentCanRead = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pagesStudentCanRead + arr[i] <= pages) {
                pagesStudentCanRead += arr[i];
            }else{
                student++;
                pagesStudentCanRead += arr[i];
            }
        }
        return student;
    }

    public static int findMaxAllocation(int arr[], int k){
        int ans = 0;
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.max(min, arr[i]);
            max = max+arr[i];
        }
        
        for (int i = min; i < max; i++) {
            int countStudent = funCountStu(arr, i);

            if(countStudent == k){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {25,46,28,49,24};
        int k = 4;
        System.out.println(findMaxAllocation(arr, k));
    }
}
