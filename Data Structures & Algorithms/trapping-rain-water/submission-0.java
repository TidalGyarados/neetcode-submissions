class Solution {
    public int trap(int[] height) {
       int length = height.length;
       int[] prefix = new int[length];
       int[] suffix = new int[length];
       int pHeight = 0;
       int sHeight = 0;
       int maxArea = 0;
       int waterHeight = 0;

       for (int i = 0; i < length; i++) {
        prefix[i] = pHeight;
        pHeight = Math.max(pHeight, height[i]);
       }

       for (int i = length - 1; i >=0; i--) {
        suffix[i] = sHeight;
        sHeight = Math.max(sHeight, height[i]);
       }

       for (int i = 0; i < length; i++) {
        waterHeight = Math.min(prefix[i], suffix[i]) - height[i];
        if (waterHeight > 0) {
           maxArea = maxArea + waterHeight;
        }
       }
       return maxArea;
    }
}
