package shuhuai.leetcode.problems.t0.t74;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = 0;
        while (i < matrix.length) {
            if (matrix[i][0] == target) {
                return true;
            }
            if (matrix[i][0] > target) {
                break;
            }
            i++;
        }
        if (i == 0) {
            return false;
        }
        i--;
        while (j < matrix[0].length) {
            if (matrix[i][j] == target) {
                return true;
            }
            j++;
        }
        return false;
    }

    public boolean searchMatrixBinary(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            int mid = (left - right) / 2 + right;
            int i = mid / matrix[0].length;
            int j = mid % matrix[0].length;
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}