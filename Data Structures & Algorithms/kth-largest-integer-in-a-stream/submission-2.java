class KthLargest {
    PriorityQueue<Integer> stream;
    int capacity;

    public KthLargest(int k, int[] nums) {
        capacity = k;
        stream = new PriorityQueue<>(capacity);
        for(int i = 0; i < nums.length; i++) {
            stream.add(nums[i]);
            if (stream.size() > capacity) {
                stream.remove();
            }
        }
    }
    
    public int add(int val) {
        stream.add(val);
        if (stream.size() > capacity) {
            stream.remove();
        }
        return stream.peek();
    }
}
