class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int left=0, right=row*column-1;
        int middle, r, c;
        while(left <= right) {
            middle = (right+left)/2;
            r = middle/column;
            c = middle%column;
            if (matrix[r][c] == target) {
                return true;
            } else if (target > matrix[r][c]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }
}

// m*i + j
