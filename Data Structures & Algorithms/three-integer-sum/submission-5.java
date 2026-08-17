class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		/*Arrays.sort(nums);
		List<List<Integer>> output = new LinkedList();

		for(int i = 0; i < nums.length-2; i++) {
			int start = i+1;
			int end = nums.length-1;
			int remainder = nums[i];
			int sum;
			while (start < end) {
				sum = nums[start] + nums[end] + remainder;
				if (sum == 0) {
					//System.out.println(nums[start] + "," + nums[end] + "," + remainder);
					output.add(Arrays.asList(nums[i],nums[start],nums[end]));
					while(start < nums.length-1 && nums[start] == nums[start+1]) {
						start++;
					}
					while(end > 0 && nums[end] == nums[end-1]) {
						end--;
					}
					break;
				} else if (sum > 0) {
					end--;
				} else {
					start++;
				}


			}
		}
		return output;*/
                Arrays.sort(nums);
        int low, high;
        List<List<Integer>> result = new LinkedList();
        for (int i=0; i < nums.length-2; i++) {
            low = i+1;
            high = nums.length-1;
            int sum = 0 - nums[i];
            while(low < high) {
                if (nums[low] + nums[high] == sum) {
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
                } else if (nums[low] + nums[high] > sum) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;
    }
}
