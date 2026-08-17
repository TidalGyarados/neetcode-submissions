class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> postFix = new Stack<>();
        int num1, num2, tmpNum = 0;
        for (int i = 0; i < tokens.length; i++) {
            if ("+".equals(tokens[i]) || "-".equals(tokens[i]) || "*".equals(tokens[i]) || "/".equals(tokens[i])) {
                num2 = postFix.pop();
                num1 = postFix.pop();
                if ("+".equals(tokens[i])) {
                    tmpNum = num1 + num2;
                } else if ("-".equals(tokens[i])) {
                    tmpNum = num1 - num2;
                } else if ("*".equals(tokens[i])) {
                    tmpNum = num1 * num2;
                } else if ("/".equals(tokens[i])) {
                    tmpNum = num1 / num2;
                }
                postFix.push(tmpNum);
            } else {
                postFix.push(Integer.parseInt(tokens[i]));
            }
        }
        return postFix.pop();
    }
}
