class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Solution 2
        HashMap<Character, Integer> visited = new HashMap();
        int maxSub = 0;
        int left = 0;
        int right = 0;
        int length = s.length();
        char ch;
        int position;
        while (right < length) {
            ch = s.charAt(right);
            if (visited.get(ch) != null) {
                maxSub = Math.max(maxSub, right-left);
                position = visited.get(ch);
                while (left <= position) {
                    visited.remove(s.charAt(left));
                    left++;
                }
            }
            visited.put(ch, right);
            right++;
        }
        maxSub = Math.max(maxSub, right-left);
        return maxSub;

        //Solution 1
        /*
        HashSet<Character> visited = new HashSet();
        int maxSub = 0;
        int current,j;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            current = 0;
            j = i;
            visited.clear();
            while(j < length && !visited.contains((char)s.charAt(j))) {
                current++;
                visited.add(s.charAt(j));
                j++;
            }
            maxSub = Math.max(current, maxSub);
        }
        return maxSub;
        */
    }
}
