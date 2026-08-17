class Solution {
    public String minRemoveToMakeValid(String s) {
        int openBraceCount = 0;
        char ch;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(') {
                openBraceCount++;
            }
            if (ch == ')' && openBraceCount == 0) {
                continue;
            } else if (ch == ')') {
                openBraceCount--;
            }
            output.append(ch);
        }

        int outputLength = output.length();
        int iter = outputLength-1;
        while(iter >= 0 && openBraceCount > 0) {
            if (output.charAt(iter) == '(') {
                output.deleteCharAt(iter);
                openBraceCount--;
            }
            iter--;
        }
        return output.toString();
    }
}