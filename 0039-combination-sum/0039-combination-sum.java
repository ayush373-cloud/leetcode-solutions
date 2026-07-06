class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    void backtrack(int[] arr, int target, int idx,
                   List<Integer> list,
                   List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (target < 0 || idx == arr.length)
            return;

        list.add(arr[idx]);
        backtrack(arr, target - arr[idx], idx, list, ans);

        list.remove(list.size() - 1);
        backtrack(arr, target, idx + 1, list, ans);
    }
}