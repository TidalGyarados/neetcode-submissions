class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> subset = new ArrayList<>();
        dfs(s, 0, subset, result);
        return result;        
    }

    private void dfs(String s, int start, List<String> subset, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(subset));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                subset.add(s.substring(start, end+1));
                dfs(s,end+1, subset, result);
                subset.remove(subset.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while(start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
