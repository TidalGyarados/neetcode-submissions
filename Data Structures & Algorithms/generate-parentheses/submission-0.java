class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(n,0,0,"",result);
        return result;
    }

    public void dfs(int n, int openC, int closeC, String subset, List<String> result) {
        if (subset.length() == n*2) {
            result.add(subset);
            return;
        }
        if (openC < n) {
            dfs(n, openC+1, closeC, subset + "(", result);
        }
        if (closeC < openC) {
            dfs(n, openC, closeC+1, subset + ")", result);
        }
    }
}
