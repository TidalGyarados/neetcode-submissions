class Solution {
    public boolean isValidSudoku(char[][] board) {
               int row = board.length;
        int column = board[0].length;

        // check rows
        Set<Character> present = new HashSet<>();
        for (int i = 0; i < row; i++) {
            present.clear();
            for (int j = 0; j < column; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (present.contains(c)) {
                        return false;
                    } else {
                        present.add(c);
                    }
                }
            }
        }

        // check columns
        for (int i = 0; i < row; i++) {
            present.clear();
            for (int j = 0; j < column; j++) {
                char c = board[j][i];
                if (c != '.') {
                    if (present.contains(c)) {
                        return false;
                    } else {
                        present.add(c);
                    }
                }
            }
        }

        // check the sub-box

        for (int square = 0; square < 9; square++) {
            present.clear();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int r = (square / 3) * 3 + i;
                    int co = (square % 3) * 3 + j;
                    char c = board[r][co];
                    if (c != '.') {
                        if (present.contains(c)) {
                            return false;
                        } else {
                            present.add(c);
                        }
                    }
                }
            }
        }
        return true;

    }
}
