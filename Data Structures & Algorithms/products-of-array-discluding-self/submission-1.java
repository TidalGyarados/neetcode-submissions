class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        int[] prefix = new int[length];
        int[] suffix = new int[length];

        // calculate prefix excluding current index
        prefix[0] = 1;
        for (int i = 1; i < length; i ++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        // calculate suffix excluding current index
        suffix[length-1] = 1;
        for (int i = length-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for (int i = 0; i < length; i ++) {
            answer[i] = prefix[i] * suffix[i];
        }
        return answer;
 /*     int length = nums.length;
        int[] answer = new int[nums.length];
        int output = 1;
        int countzero = 0;
        for (int j = 0; j < length; j++) {
            if (nums[j] != 0) {
                output = output * nums[j];
            } else {
                countzero++;
            }
        }

        for (int i = 0; i< length; i++) {
            if (countzero > 1) {
                answer[i] = 0; 
            } else if (nums[i]== 0) {
              answer[i] = output;  
            } else {
                answer[i] = ((countzero == 1) ? 0 : output/nums[i]);
            }
        }
        return answer;
        */
    }
}  
