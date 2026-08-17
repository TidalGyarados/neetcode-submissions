class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Your code goes here        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, 0, target, new ArrayList<>(), result);
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
            if (i > pos && nums[i]== nums[i-1]) {
                continue;
            }
            subset.add(nums[i]);
            dfs(nums, i+1,  target-nums[i], subset,result);
            subset.remove(subset.size()-1);
        }
    }
}
