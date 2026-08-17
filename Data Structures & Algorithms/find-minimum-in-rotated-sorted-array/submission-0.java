class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        int middle;
        int min = nums[left];
        while (left <= right) {
            if (nums[left] < nums[right]) {
                min = Math.min(min, nums[left]);
                return min;
            }

            middle = (left+right)/2;
            min = Math.min(min, nums[middle]);
            if (nums[middle] >= nums[left]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }
        return min; 
    }
}
