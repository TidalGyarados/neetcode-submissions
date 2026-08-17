class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int[] nums, int pos, int target, List<Integer> subset, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i=pos; i < nums.length; i++) {
            subset.add(nums[i]);
            dfs(nums, i,  target-nums[i], subset,result);
            subset.remove(subset.size()-1);
        }
    }
}
