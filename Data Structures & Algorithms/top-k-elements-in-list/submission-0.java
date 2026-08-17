class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];
        int[] result = new int[k];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < nums.length; i++) {
            numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
        }

        for (var entry : numsMap.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }

        int count = 0; //Elements added to the result
        for (int i = bucket.length - 1 ; i > 0 && count < k ; i--) {
            List<Integer> items = bucket[i];
            for (int item : items) {
                result[count] = item;
                count++;
                if (count == k) {
                    return result;
                } 
            }
        }
        return result;
    }
}
