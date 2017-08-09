package com.java.algorithm;
/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-22 上午9:52
 */
public class Sudoku {
    private int[][] matrix;

    public Sudoku(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * 数独算法
     * 
     * @param i
     *            行号
     * @param j
     *            列号
     */
    private void backTRace(int i, int j) {
        if (i == 8 && j == 9) {
            System.out.println("获取正确解");
            printArray();
            return;
        }
        if (j == 9) {
            i++;
            j = 0;
        }

        // 如果i行j列是空格，那么才进入空格填值的逻辑
        if (matrix[i][j] == 0) {
            for (int k = 1; k <= 9; k++) {
                // 判断给i行j列放入的值能否满足规则
                if (check(i, j, k)) {
                    // 如果可以，将该值放入空格，然后进入下一个空格
                    matrix[i][j] = k;
                    backTRace(i, j + 1);
                    // 回溯的关键
                    matrix[i][j] = 0;
                    int a = 0;
                }
            }
        } else {
            // 如果该位置已经有值了，就进入下一个空格进行计算
            backTRace(i, j + 1);
        }
    }

    /**
     * 判断给某行某列赋值是否符合规则
     * 
     * @param row
     *            被赋值的行号
     * @param line
     *            被赋值的列号
     * @param number
     *            赋的值
     * @return
     */
    private boolean check(int row, int line, int number) {
        // 判断该行该列是否有重复数字
        for (int i = 0; i < 9; i++) {
            if (matrix[row][i] == number || matrix[i][line] == number) {
                return false;
            }
        }
        // 判断小九宫格是否有重复
        int tempRow = row / 3;
        int tempLine = line / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[tempRow * 3 + i][tempLine * 3 + j] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    public void printArray() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] sudoku = {{8, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 3, 6, 0, 0, 0, 0, 0}, {0, 7, 0, 0, 9, 0, 2, 0, 0},
                {0, 5, 0, 0, 0, 7, 0, 0, 0}, {0, 0, 0, 0, 4, 5, 7, 0, 0}, {0, 0, 0, 1, 0, 0, 0, 3, 0}, {0, 0, 1, 0, 0, 0, 0, 6, 8},
                {0, 0, 8, 5, 0, 0, 0, 1, 0}, {0, 9, 0, 0, 0, 0, 4, 0, 0}};
        Sudoku s = new Sudoku(sudoku);
        s.backTRace(0, 0);
    }
}
