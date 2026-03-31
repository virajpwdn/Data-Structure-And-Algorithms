class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(n, k, result, new ArrayList<>(), 1);
        return result;
    }

    public void backTrack(
        int n,
        int k,
        List<List<Integer>> result,
        List<Integer> path,
        int start
    ) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n; i++) {
            path.add(i);
            backTrack(n, k, result, path, i + 1);
            path.remove(path.size() - 1);
        }
        return;
    }
}
