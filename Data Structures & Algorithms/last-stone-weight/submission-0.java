class Solution {
    public int lastStoneWeight(int[] stones) {
        int returnValue = 0;
        Comparator<Integer> c = (a, b) -> Integer.compare(b, a); 
        PriorityQueue<Integer> stoneQueue = new PriorityQueue<>(c);
        for (int i=0; i < stones.length; i++) {
            stoneQueue.add(stones[i]);
        }

        while (stoneQueue.size() > 1) {
            int largest = stoneQueue.remove();
            int secondLargest = stoneQueue.remove();
            int result = 0;
            if (largest > secondLargest) {
                result = largest - secondLargest;
            } else {
                result = secondLargest - largest;
            }
            if (result > 0) {
                stoneQueue.add(result);
            }
        }

        if (stoneQueue.size() == 1) {
            returnValue = stoneQueue.remove();
        }

        return returnValue;
    }
}
