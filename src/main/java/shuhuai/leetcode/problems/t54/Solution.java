package shuhuai.leetcode.problems.t54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int direction = 0;
        int i = 0;
        int j = 0;
        while (result.size() < matrix.length * matrix[0].length) {
            result.add(matrix[i][j]);
            matrix[i][j] = Integer.MIN_VALUE;
            switch (direction) {
                case 0:
                    if (j + 1 < matrix[0].length && matrix[i][j + 1] != Integer.MIN_VALUE) {
                        j++;
                    } else {
                        direction = 1;
                        i++;
                    }
                    break;
                case 1:
                    if (i + 1 < matrix.length && matrix[i + 1][j]!= Integer.MIN_VALUE) {
                        i++;
                    } else {
                        direction = 2;
                        j--;
                    }
                    break;
                case 2:
                    if (j - 1 >= 0 && matrix[i][j - 1]!= Integer.MIN_VALUE) {
                        j--;
                    } else {
                        direction = 3;
                        i--;
                    }
                    break;
                case 3:
                    if (i - 1 >= 0 && matrix[i - 1][j]!= Integer.MIN_VALUE) {
                        i--;
                    } else {
                        direction = 0;
                        j++;
                    }
                    break;
            }
        }
        return result;
    }
}