class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sHashMap  = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char tmps = s.charAt(i);
           if (sHashMap.get(tmps) == null) {
            sHashMap.put(tmps, 1);
           } else {
            int count = sHashMap.get(tmps);
            sHashMap.put(tmps, ++count);
           }
        }

        for (int i = 0; i < t.length(); i++) {
            char tmpt = t.charAt(i);
            if (sHashMap.get(tmpt) == null) {
                return false;
            } else {
                int count = sHashMap.get(tmpt);
                if (count == 1) {
                    sHashMap.remove(tmpt);
                } else {
                    sHashMap.put(tmpt, --count);
                }
            }
        }

        if (sHashMap.isEmpty()) {
            return true;
        }
        return false;
    }
}
