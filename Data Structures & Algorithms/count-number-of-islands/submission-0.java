class Solution {
    public int numIslands(char[][] grid) {
        int islandCount = 0;
        for (int i=0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                char currentCell = grid[i][j];
                if (currentCell == '1') {
                    islandCount++;
                    dfs(grid, i, j);
                }
            }
        }
        return islandCount;
    }

    public void dfs(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length 
        || col < 0 || col >= grid[0].length) {
            return;
        }
        if (grid[row][col] == '1') {
            grid[row][col] = '0';
            dfs(grid, row+1, col);
            dfs(grid, row-1, col);
            dfs(grid, row, col+1);
            dfs(grid, row, col-1);
        }
        return;
    }
}
