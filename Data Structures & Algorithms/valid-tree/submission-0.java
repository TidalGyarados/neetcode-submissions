class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length-1 != n) {
            //return false;
        }

        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for(int i=0; i < n; i++) {
            adjList.put(i, new ArrayList<>());
        }
        for(int[] edge: edges) {
            adjList.get(edge[0]).add(edge[1]); 
            adjList.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();
        if (hasCycle(adjList,visited, 0, -1)) {
            return false;
        }
        if (visited.size() != n) {
            return false;
        }
        return true;
    }

    private boolean hasCycle(Map<Integer, List<Integer>> adjList, Set<Integer> visited, int n, int parent) {
        if (visited.contains(n)) {
            return true;
        }
        visited.add(n);
        for (Integer neighbor : adjList.get(n)) {
            if (neighbor == parent) {
                continue;
            }
            if (hasCycle(adjList, visited, neighbor, n)) {
                return true;
            }
        }
        return false;
    }
}
