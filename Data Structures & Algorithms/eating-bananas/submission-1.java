class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = Arrays.stream(piles).max().getAsInt();
        int result = right;
        int middle;
        while (left <= right) {
            middle = (left+right)/2;
            // Calculate time it takes 
            int time = 0;
            for (int i = 0; i < piles.length; i++) {
                //time += Math.ceil((double)piles[i]/middle);
                time += piles[i]/middle;
                if (piles[i]%middle > 0) {
                    time +=1;
                }
            }
            if (time <= h) {
                result = middle;
                right = middle -1;
            } else {
                left = middle+1;
            }
        }
        return result;
    }
}
