class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int low, high;
        List<List<Integer>> result = new LinkedList();
        for (int i=0; i < nums.length-2; i++) {
            low = i+1;
            high = nums.length-1;

            while(low < high) {
                if (nums[low] + nums[high] + nums[i] == 0) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while(i< nums.length-2 && nums[i] == nums[i+1]) {
                        i++;
                    }
                    while(low < nums.length-1 && nums[low] == nums[low+1]) {
                        low++;
                    }
                    while(high > 1 && nums[high] == nums[high-1]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if (nums[low] + nums[high] + nums[i] > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;
    }
}
