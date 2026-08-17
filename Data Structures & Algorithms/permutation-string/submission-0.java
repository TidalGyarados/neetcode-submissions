class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        if (s1Length > s2Length) {
            return false;
        }

        HashMap<Character, Integer> s1Map = new HashMap();
        HashMap<Character, Integer> s2Map = new HashMap();
        int left = 0, right = s1Length-1;
        for (int i=0; i < s1Length; i++) {
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0) + 1);
            s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i), 0) + 1);
        }

        s2Map.put(s2.charAt(right), s2Map.get(s2.charAt(right)) - 1);
        while(right < s2Length) {
            s2Map.put(s2.charAt(right), s2Map.getOrDefault(s2.charAt(right), 0) + 1);
            if (s1Map.equals(s2Map)) {
                return true;
            } else {
                if (s2Map.get(s2.charAt(left)) == 1) {
                    s2Map.remove(s2.charAt(left));
                } else {
                    s2Map.put(s2.charAt(left), s2Map.get(s2.charAt(left)) - 1);
                }
                left++;
                right++;
            }
        }
        return false;
    }
}
