class Solution {
    public int maxArea(int[] heights) {
        int end = heights.length - 1;
        int start = 0;
        int max = 0;
        int current = 0;
        while(start < end) {
            current = (end - start) * Math.min(heights[start], heights[end]);
            if (current > max) {
                max = current;
            }
            if (heights[start] > heights[end]) {
                end--;
            } else {
                start++;
            }
        }
        return max;
    }
}
