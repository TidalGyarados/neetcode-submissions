class Solution {

    public String encode(List<String> strs) {
        char specialChar = '#';
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            int length = str.length();
            sb.append(length);
            sb.append(specialChar);
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        char specialChar = '#';
        int length = str.length();
        List<String> result = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        for(int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if(ch == specialChar) {
                int strLength = Integer.parseInt(number.toString());
                number.setLength(0);
                String subString = str.substring(i+1, i+strLength+1);
                result.add(subString);
                i = i+strLength;
            } else {
                number.append(ch);
            }
        }
        return result;
    }
}
