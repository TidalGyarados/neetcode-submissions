class Solution {
    public int longestConsecutive(int[] nums) {
        /*HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        int maxLen = 0;
        for(int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i] - 1)){
                continue;
            }
            int curLen = 0;
            int startNumber = nums[i];
            while (numbers.contains(startNumber)) {
                curLen++;
                startNumber++;
            }
            if (curLen > maxLen) {
               maxLen = curLen; 
            }
        }
        return maxLen;*/
                HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        // Keep track of the start of sequence to not repeat
        HashSet<Integer> starts = new HashSet<>();
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!numbers.contains(nums[i] - 1) && !starts.contains(nums[i])){
                int curLen = 0;
                int startNumber = nums[i];
                while (numbers.contains(startNumber + curLen)) {
                    curLen++;
                }
                starts.add(startNumber);
                maxLen = Math.max(maxLen, curLen);
            }
        }
        return maxLen;
    }
}
