class Solution {
    public String minWindow(String s, String t) {
        // Empty target
        if (t.length() == 0) {
            return "";
        }
        HashMap<Character, Integer> target = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        // HashMap of the target t
        for (int i = 0; i < t.length(); i++) {
            char currChar = t.charAt(i);
            target.put(currChar, target.getOrDefault(currChar, 0)+ 1);
        }

        // count of the target - which the count of keys
        int targetCount = target.size();
        int windowCount = 0;
        int[] resultWindow = {-1, -1}; // Track the result window
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;

        // Iterate through the s
        for(right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            window.put(currChar, window.getOrDefault(currChar, 0)+ 1);
            if (target.get(currChar) != null 
            && window.get(currChar) == target.get(currChar)) {
                windowCount++;
            }

            // Found all the characters
            while (windowCount == targetCount) {
                // Update the minLength if needed
                if ((right-left+1) < minLength) {
                    minLength = right-left+1;
                    resultWindow[0] = left;
                    resultWindow[1] = right;
                }

                //reduce the length
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (target.get(leftChar) != null 
                && window.get(leftChar) < target.get(leftChar)) {
                    windowCount--;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(resultWindow[0], resultWindow[1]+1);
    }
}
