package shuhuai.leetcode.problems.t289;

public class Solution {
    public void gameOfLife(int[][] board) {
        int[][] needReverse = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int count = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k >= 0 && k < board.length && l >= 0 && l < board[0].length && !(k == i && l == j)) {
                            count += board[k][l];
                        }
                    }
                }
                if (board[i][j] == 1 && (count < 2 || count > 3)) {
                    needReverse[i][j] = 1;
                } else if (board[i][j] == 0 && count == 3) {
                    needReverse[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (needReverse[i][j] == 1) {
                    board[i][j] = board[i][j] == 1 ? 0 : 1;
                }
            }
        }
    }

    public void gameOfLifeClever(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int count = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k >= 0 && k < board.length && l >= 0 && l < board[0].length && !(k == i && l == j)) {
                            count += board[k][l] % 2;
                        }
                    }
                }
                if (board[i][j] == 1 && (count < 2 || count > 3)) {
                    board[i][j] = 3;
                } else if (board[i][j] == 0 && count == 3) {
                    board[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] > 1) {
                    board[i][j] = (board[i][j] + 1) % 2;
                }
            }
        }
    }
}