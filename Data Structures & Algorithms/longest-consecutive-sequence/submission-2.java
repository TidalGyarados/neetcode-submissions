class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0;
        Set<Integer> uniqueNumber = new HashSet<>();
        for(int i =0; i < nums.length; i++) {
            uniqueNumber.add(nums[i]);
        }

        for(int i =0; i < nums.length; i++) {
            if(!uniqueNumber.contains(nums[i]-1)) {
                int start = nums[i];
                int length = 0;
                while(uniqueNumber.contains(start+ length)) {
                    length++;
                }
                maxLen = Math.max(maxLen, length);
            }
        }
        return maxLen;
    }
}
