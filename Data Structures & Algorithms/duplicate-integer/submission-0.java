class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer, Boolean> uniqueNumbers = new HashMap<>();
       boolean duplicateFound = false;
       for (int i = 0; i < nums.length; i++) {
        if (uniqueNumbers.get(nums[i]) == null) {
            uniqueNumbers.put(nums[i], true);
        } else {
            duplicateFound = true;
            break;
        }
       }
       return duplicateFound;
    }
}