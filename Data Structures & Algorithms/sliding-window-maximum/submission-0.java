class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
                int length = nums.length;
        int[] output = new int[length-k+1];
        Deque<Integer> myDeque = new ArrayDeque<>();
        int left = 0;
        int right = 0;

        while(right < length) {
            //Insert in deque in decreasing order
            while(!myDeque.isEmpty() && nums[myDeque.getLast()] < nums[right]) {
                myDeque.removeLast();
            }
            myDeque.addLast(right);

            // Pop if not in the window
            if (left > myDeque.getFirst()) {
                myDeque.removeFirst();
            }

            // Get the max value which is first
            if (right - left + 1 == k) {
                output[left] = nums[myDeque.getFirst()];
                left++;
            }

            //increment counter
            right++;

        }
        return output;

    }
}
