class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<Integer,Map<Character, Integer>> listOfMaps = new HashMap<>();
       for (int i = 0; i < strs.length; i++) {
        String iStr = strs[i];
        Map<Character, Integer> sHashMap = new HashMap<>();
        for (int j = 0; j < iStr.length(); j++) {
            char chr = iStr.charAt(j);
            sHashMap.put(chr, sHashMap.getOrDefault(chr, 0) + 1);
        }
        listOfMaps.put(i,sHashMap);
       }
       List<List<String>> listoflistStrings = new ArrayList<>();
       for (int i = 0; i < strs.length; i++) {
        Map<Character, Integer> iHashMap = listOfMaps.get(i);
        if (iHashMap != null) {
            List<String> listStrings = new ArrayList<>();
            listStrings.add(strs[i]);
            for (int j = i+1; j < strs.length; j++) {
              Map<Character, Integer> jHashMap = listOfMaps.get(j);
              if (jHashMap!= null && iHashMap.equals(jHashMap)) {
               listStrings.add(strs[j]);
               listOfMaps.remove(j);
              }
            }
            listoflistStrings.add(listStrings);
        }
       }
       return listoflistStrings;
    }
}
