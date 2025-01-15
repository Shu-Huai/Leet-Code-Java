package shuhuai.leetcode.problems.t100.t120;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        dp[0][0] = triangle.getFirst().getFirst();
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + triangle.get(i).get(j), dp[i - 1][j] + triangle.get(i).get(j));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < dp.length; i++) {
            min = Math.min(min, dp[dp.length - 1][i]);
        }
        return min;
    }

    public int minumumTotalClever(List<List<Integer>> triangle) {
        int[][] dp = new int[2][triangle.size()];
        dp[0][0] = triangle.getFirst().getFirst();
        int cur = 0;
        int pre;
        for (int i = 1; i < triangle.size(); i++) {
            cur = i % 2;
            pre = 1 - cur;
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[cur][j] = dp[pre][j] + triangle.get(i).get(j);
                } else if (j == i) {
                    dp[cur][j] = dp[pre][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[cur][j] = Math.min(dp[pre][j - 1] + triangle.get(i).get(j), dp[pre][j] + triangle.get(i).get(j));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < dp[0].length; i++) {
            min = Math.min(min, dp[cur][i]);
        }
        return min;
    }

    public int minumumTotalSuperClever(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        dp[0] = triangle.getFirst().getFirst();
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = i; j >= 0; j--) {
                if (j == 0) {
                    dp[j] = dp[j] + triangle.get(i).get(j);
                } else if (j == i) {
                    dp[j] = dp[j - 1] + triangle.get(i).get(j);
                } else {
                    dp[j] = Math.min(dp[j - 1] + triangle.get(i).get(j), dp[j] + triangle.get(i).get(j));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int j : dp) {
            min = Math.min(min, j);
        }
        return min;
    }
}