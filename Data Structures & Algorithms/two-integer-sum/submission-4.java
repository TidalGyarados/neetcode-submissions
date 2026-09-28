class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            Integer remaining = numMap.get(target - nums[i]);
            if (remaining != null) {
                return new int[] {remaining, i}; 
            } else {
               numMap.put(nums[i], i); 
            }
        }
        return null;
    }
}
