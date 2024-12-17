package shuhuai.leetcode.problems.t48;

public class Solution {
    public void rotate(int[][] matrix) {
        for (int h = 0; h < matrix.length / 2; h++) {
            int[] temp = new int[matrix.length - 2 * h];
            System.arraycopy(matrix[h], h, temp, 0, temp.length);
            for (int i = 0; i < temp.length; i++) {
                matrix[h][matrix.length - 1 - h - i] = matrix[i + h][h];
            }
            for (int i = 0; i < temp.length; i++) {
                matrix[i + h][h] = matrix[matrix.length - h - 1][i + h];
            }
            for (int i = 0; i < temp.length; i++) {
                matrix[matrix.length - h - 1][i + h] = matrix[matrix.length - i - 1 - h][matrix.length - h - 1];
            }
            for (int i = 0; i < temp.length; i++) {
                matrix[matrix.length - i - 1 - h][matrix.length - h - 1] = temp[temp.length - i - 1];
            }
        }
    }
}
