class Solution {
    class Pair {
        int value;
        int row;
        int col;

        Pair(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.value - b.value);

        int n = matrix.length;
        for(int i=0; i<n; i++) {
            pq.add(new Pair(matrix[i][0], i, 0));
        }

        for(int i=0; i<k-1; i++) {
            Pair curr = pq.poll();
            if(curr.col + 1 < n) {
                pq.add(new Pair(matrix[curr.row][curr.col + 1], curr.row, curr.col + 1));
            }
        }

        return pq.peek().value;
    }
}
