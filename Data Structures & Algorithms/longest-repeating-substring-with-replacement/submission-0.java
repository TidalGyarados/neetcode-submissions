class Solution {
    public int characterReplacement(String s, int k) {
        int length = s.length();
        int left = 0, right = 0;
        int max = 0, frequentCharCount = 0;
        HashMap<Character, Integer> inputChar = new HashMap();

        while (right < length) {
            // Increment the inputChar
            char ch = s.charAt(right);
            inputChar.put(ch, inputChar.getOrDefault(ch, 0)+ 1);
            frequentCharCount= (Collections.max(inputChar.values()));

            // check whether the string between left and right is valid
            while (right - left + 1  - frequentCharCount > k) {
                inputChar.put(s.charAt(left), inputChar.get(s.charAt(left)) - 1);
                left++;
                frequentCharCount= (Collections.max(inputChar.values()));
            } 
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
