package com.java.leetCode;

public class IsValidSudoku_36 {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0;i<9;i++) {
            for(int j = 0;j<9;j++) {
                if (board[i][j] == '.') {
                    continue;
                } else {
                    if (check(board, i, j)) {
                        continue;
                    }else {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static boolean check(char[][] board, int i, int j) {
        char ch = board[i][j];
        for(int k = 0;k!=i&&k<9;k++) {
            if (board[k][j] == ch) {
                return false;
            }
        }
        for(int k = 0;k!=j&&k<9;k++) {
            if (board[i][k] == ch) {
                return false;
            }
        }
        int tmpRow = i/3;
        int tmpLine = j/3;
        for(int m= 0;m<3;m++) {
            for (int n = 0;n<3;n++) {
                if (tmpRow * 3 + m == i && tmpLine * 3 + n == j) {
                    continue;
                }
                if (board[tmpRow * 3 + m][tmpLine * 3 + n] == ch) {
                    return false;
                }
            }
        }
        return true;
    }


}
