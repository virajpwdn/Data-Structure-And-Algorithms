class Solution {

    public List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        backTrack(arr, result, 0, new ArrayList<>());
        return result;
    }

    public void backTrack(
        int arr[],
        List<List<Integer>> result,
        int start,
        List<Integer> path
    ) {
        result.add(new ArrayList<>(path));

        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            path.add(arr[i]);
            backTrack(arr, result, i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
