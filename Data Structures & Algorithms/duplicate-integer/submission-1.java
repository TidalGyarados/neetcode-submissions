class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            uniqueSet.add(nums[i]);
        }

        if (uniqueSet.size() != nums.length) {
            return true;
        }
        return false;    
    }
}