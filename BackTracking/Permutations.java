class Solution {

    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(arr, result, new ArrayList<>());
        return result;
    }

    public void backTrack(
        int[] arr,
        List<List<Integer>> result,
        List<Integer> path
    ) {
        if (path.size() == arr.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!includesResultArray(path, arr[i])) {
                path.add(arr[i]);
                backTrack(arr, result, path);
                path.remove(path.size() - 1);
            }
        }
    }

    public boolean includesResultArray(List<Integer> path, int value) {
        for (int i = 0; i < path.size(); i++) {
            if (path.get(i) == value) {
                return true;
            }
        }
        return false;
    }
}
