package Arrays;
// Agar apne ko total pairs find karne ho subarrays ke toh formula hota hai totalpair = n*(n-1)/2 => this forumula is also called as Arithematic Progression

public class pairs {
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                System.out.print("("+nums[i] + "," + nums[j] + ")" + " ");
            }
            System.out.println();
        }
    }
}
