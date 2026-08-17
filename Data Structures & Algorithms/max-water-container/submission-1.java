class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length-1;
        int maxValue = Integer.MIN_VALUE;
        while(start < end) {
            int area = (end-start) * Math.min(heights[start], heights[end]);
            maxValue = Math.max(maxValue, area);
            if (heights[start] > heights[end]) {
                end--;
            } else {
                start++;
            }
        }
        return maxValue;
    }
}
