package shuhuai.leetcode.problems.t36;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (char[] chars : board) {
            Set<Character> set = new HashSet<>();
            for (char aChar : chars) {
                if (aChar != '.') {
                    if (set.contains(aChar)) {
                        return false;
                    }
                    set.add(aChar);
                }
            }
        }
        for (int j = 0; j < 9; j++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        return false;
                    }
                    set.add(board[i][j]);
                }
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Set<Character> set = new HashSet<>();
                for (int k = 0; k < 9; k++) {
                    if (board[i + k / 3][j + k % 3] != '.') {
                        if (set.contains(board[i + k / 3][j + k % 3])) {
                            return false;
                        }
                        set.add(board[i + k / 3][j + k % 3]);
                    }
                }

            }
        }
        return true;
    }

    public boolean isValidSudokuClever(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][][] boxes = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1;
                    rows[i][num]++;
                    cols[j][num]++;
                    boxes[i / 3][j / 3][num]++;
                    if (rows[i][num] > 1 || cols[j][num] > 1 || boxes[i / 3][j / 3][num] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}