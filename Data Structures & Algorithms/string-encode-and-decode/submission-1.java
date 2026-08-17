class Solution {

    public String encode(List<String> strs) {
        char uniqueChar = '#';
        String output = "";
        int size = strs.size();
        for (int i = 0; i < size; i ++) {
            output += String.valueOf(strs.get(i).length()) + uniqueChar + strs.get(i);
        }
        return output;
    }

    public List<String> decode(String s) {
        List<String> output = new ArrayList();
        char uniqueChar = '#';
        int length = s.length();
        String number = "";
        for(int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == uniqueChar) {
                int strLength = Integer.parseInt(number);
                number = "";
                String substring = s.substring(i+1, i+1 + strLength);
                output.add(substring);
                i = i + strLength;
            } else {
               number = number + ch;
            }

        }
        return output;
    }
}
