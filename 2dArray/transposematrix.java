public class transposematrix {

    public int[][] transpose(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int ans[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                // int temp = matrix[i][j];
                ans[i][j] = matrix[j][i];
                // matrix[j][i] = temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
                };
    }
}