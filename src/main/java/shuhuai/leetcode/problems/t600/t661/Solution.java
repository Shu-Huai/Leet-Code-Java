package shuhuai.leetcode.problems.t600.t661;

public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                int num = 0;
                int sum = 0;
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        if (x >= 0 && x < img.length && y >= 0 && y < img[0].length) {
                            num++;
                            sum += img[x][y];
                        }
                    }
                }
                result[i][j] = sum / num;
            }
        }
        return result;
    }
}