class Solution {
    public boolean isPalindrome(String s) {
        int sLength = s.length();
        int i = 0;
        int j = sLength - 1;
        while (i < j) {
            if (!isAlphaNumeric(s.charAt(i))) {
                i++;
            } else if (!isAlphaNumeric(s.charAt(j))) {
                j--;
            } else if (Character.toUpperCase(s.charAt(i)) == Character.toUpperCase(s.charAt(j))) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isAlphaNumeric(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}
