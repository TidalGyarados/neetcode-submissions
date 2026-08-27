class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        map.put(0,1);
        map.put(1,1);
        return climbStair(n);
    }

    int climbStair(int n) {
        if(map.containsKey(n)) {
            return map.get(n);
        }
        int result = climbStair(n-1) + climbStair(n-2);
        map.put(n, result);
        return result;
    }
}
