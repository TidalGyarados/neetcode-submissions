class Solution {
    public boolean isValid(String s) {
        Stack<Character> pStack = new Stack<>();
        int length = s.length();
        for (int i=0; i< length; i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                pStack.push(s.charAt(i));
            }

            if (s.charAt(i) == ')') {
                if (pStack.isEmpty() || pStack.pop() != '(') {
                    return false;
                }
            }

            if (s.charAt(i) == '}') {
                if (pStack.isEmpty() || pStack.pop() != '{') {
                    return false;
                }
            }

            if (s.charAt(i) == ']') {
                if (pStack.isEmpty() || pStack.pop() != '[') {
                    return false;
                }
            }
        }
        if (pStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}