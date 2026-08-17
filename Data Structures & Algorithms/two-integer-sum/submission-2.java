class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> numberMap = new HashMap<>();
       for(int i = 0; i < nums.length; i++) {
            numberMap.put(nums[i], i);
       }
       for (int i = 0; i < nums.length; i++) {
        int remainder = target - nums[i];
        if (numberMap.get(remainder) != null) {
            int hashIndex = numberMap.get(remainder);
            if (i != hashIndex) {
             return new int[] {i, hashIndex};
            }
        }
       }
       return null;
    }
}
