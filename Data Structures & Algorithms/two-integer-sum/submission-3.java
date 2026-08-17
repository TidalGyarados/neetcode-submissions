class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (numMap.get(remaining) != null) {
                return new int[] {numMap.get(remaining), i}; 
            } else {
               numMap.put(nums[i], i); 
            }
        }
        return null;
    }
}
