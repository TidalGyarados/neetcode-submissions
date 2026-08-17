class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int length = prices.length;
        if (length <=1) {
            return 0;
        }
        int left = 0;
        int right = 1;
        while (right < length) {
            if (prices[left] < prices[right]) {
                max = Math.max(prices[right]-prices[left], max);
            } else {
                left = right;
            }
            right++;
        }
        return max;
        /*int max = 0;
        int length = prices.length;
        int[] bestSellPrice = new int[length];
        if (length <=1) {
            return 0;
        }
        int sellPrice = 0;
        for (int i = prices.length-1 ; i >=0; i--) {
            sellPrice = Math.max(sellPrice, prices[i]);
            bestSellPrice[i] = sellPrice;
        }

        for (int i = 0 ; i < prices.length-1; i++) {
            max = Math.max((bestSellPrice[i]- prices[i]), max);
        }
        return max;*/
    }
}
