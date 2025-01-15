package shuhuai.leetcode.problems.t300.t300;

public class Solution {
    public int lengthOfLISDp(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int result = 0;
        for (int j : dp) {
            result = Math.max(result, j);
        }
        return result;
    }

    public int lengthOfLISGreedy(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] d = new int[nums.length];
        int len = 1;
        d[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > d[len - 1]) {
                d[len++] = nums[i];
            } else {
                int l = 0, r = len - 1, pos = 0;
                while (l <= r) {
                    int mid = (l + r) >> 1;
                    if (d[mid] < nums[i]) {
                        pos = mid + 1;
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
                d[pos] = nums[i];
            }
        }
        return len;
    }
}