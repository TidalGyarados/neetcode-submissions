class Solution {
    public int search(int[] nums, int target) {
int left = 0, right = nums.length-1;
        int middle;
        int min = left;
        while (left <= right) {
            if (nums[left] < nums[right]) {
                min = (nums[left] < nums[min]) ? left : min;
                break;
            }

            middle = (left+right)/2;
            min = (nums[middle] < nums[min]) ? middle : min;
            if (nums[middle] >= nums[left]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }
        
        left = 0;
        right = nums.length-1;
        if (min > left && target <= nums[min-1] && target >= nums[left]) {
            right = min-1;
        } else {
            left = min;
        }

        while (left <= right) {
            middle = (left+right)/2;
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                right = middle-1;
            } else {
                left = middle+1;
            }
        }
        return -1;
    }
}
