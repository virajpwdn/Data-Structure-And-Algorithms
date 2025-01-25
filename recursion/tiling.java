package recursion;

public class tiling {
    public static int countTile(int n) {
        if (n == 0 || n == 1)
            return 1;

        int nm1 = countTile(n - 1);
        int nm2 = countTile(n - 2);
        int totalways = nm1 + nm2;
        return totalways;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countTile(n));
    }
}
