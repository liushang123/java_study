package com.java.leetCode;

public class SolveSudoku_37 {
    public static void solveSudoku(char[][] board) {
        backTrace(board, 0, 0);
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.print(tmp[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
    }

    public static void backTrace(char[][] board, int i, int j) {
        if (i == 8 && j == 9) {
            for (int m = 0; m < 9; m++) {
                for (int n = 0; n < 9; n++) {
                    System.out.print(board[m][n] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return ;
        }
        if (j == 9) {
            i++;
            j=0;
        }
        if (board[i][j] == '.') {
            for(char k = '1';k<='9';k++) {
                if (check(board, i, j, k)) {
                    board[i][j] = k;
                    backTrace(board,i,j+1);
                    board[i][j] = '.';
                }
            }

        }else {
            backTrace(board,i,j+1);
        }
    }

    public static void solveSudoku2(char[][] board) {
        if(board == null || board.length == 0)
            return;
        solve(board);
        int a=1;
    }

    public static boolean solve(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){//trial. Try 1 through 9
                        if(check(board, i, j, c)){
                            board[i][j] = c; //Put c for this cell

                            if(solve(board))
                                return true; //If it's the solution return true
                            else
                                board[i][j] = '.'; //Otherwise go back
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    public static boolean check(char[][] board, int row, int line,char num) {
        for(int i = 0;i<9;i++) {
            if (board[row][i] == num || board[i][line] == num) {
                return false;
            }
        }
        int tmpRow = row / 3;
        int tmpLine = line / 3;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if (board[tmpRow * 3 + i][tmpLine * 3 + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'.','.','9','7','4','8','.','.','.'},
                           {'7','.','.','.','.','.','.','.','.'},
                            {'.','2','.','1','.','9','.','.','.'},
                {'.','.','7','.','.','.','2','4','.'},
                {'.','6','4','.','1','.','5','9','.'},
                {'.','9','8','.','.','.','3','.','.'},
                {'.','.','.','8','.','3','.','2','.'},
                {'.','.','.','.','.','.','.','.','6'},
                {'.','.','.','2','7','5','9','.','.'}};
        solveSudoku2(board);
    }
}
