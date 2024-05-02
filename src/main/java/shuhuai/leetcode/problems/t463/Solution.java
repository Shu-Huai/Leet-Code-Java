package shuhuai.leetcode.problems.t463;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int total = 0;
        int duplicated = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    total++;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        duplicated++;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        duplicated++;
                    }
                }
            }
        }
        return total * 4 - duplicated * 2;
    }
}