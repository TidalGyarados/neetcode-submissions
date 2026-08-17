class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Solution 1
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
    }
}
