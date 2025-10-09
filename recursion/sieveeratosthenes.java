package recursion;

public class sieveeratosthenes {
    // public static
    public static void main(String[] args) {
        // O(nlog log n)
        int n = 20;
        boolean map[] = new boolean[n + 1];

        map[0] = true;
        map[1] = true;

        // for (int j = 2; j <= n; j++) {
        //     map[j] = true;
        // }

        for (int j = 2; j * j <= n; j++) {
            if (map[j] == false) {
                for (int j2 = j * j; j2 <= n; j2 += j) {
                    map[j2] = true;
                }
            }
        }

        System.out.println("Prime numbers range of " + n + " is : ");
        for (int j = 2; j <= n; j++) {
            if (map[j] == false) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

    }
}
