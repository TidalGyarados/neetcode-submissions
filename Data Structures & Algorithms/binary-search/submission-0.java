class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int middle = 0;
        while(left <= right) {
            middle = (right + left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle+1;
            } else {
                right = middle-1;
            }
        }
        return -1;
    }
}
