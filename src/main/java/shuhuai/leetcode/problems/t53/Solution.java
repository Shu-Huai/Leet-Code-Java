package shuhuai.leetcode.problems.t53;

public class Solution {
    public int maxSubArrayDp(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }
        int ans = dp[0];
        for (int i = 1; i < dp.length; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    public int maxSubArrayDpClever(int[] nums) {
        int dp = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp = Math.max(dp + nums[i], nums[i]);
            max = Math.max(max, dp);
        }
        return max;
    }

    private static class Status {
        public int lSum, rSum, mSum, iSum;
        public Status(int lSum, int rSum, int mSum, int iSum) {
            this.lSum = lSum;
            this.rSum = rSum;
            this.mSum = mSum;
            this.iSum = iSum;
        }
    }

    public int maxSubArrayDivide(int[] nums) {
        return divide(nums, 0, nums.length - 1).mSum;
    }

    private Status divide(int[] nums, int left, int right) {
        if (left == right) {
            return new Status(nums[left], nums[left], nums[left], nums[left]);
        }
        int mid = (left + right) >> 1;
        Status lStatus = divide(nums, left, mid);
        Status rStatus = divide(nums, mid + 1, right);
        int lSum = Math.max(lStatus.lSum, lStatus.iSum + rStatus.lSum);
        int rSum = Math.max(rStatus.rSum, rStatus.iSum + lStatus.rSum);
        int mSum = Math.max(Math.max(lStatus.mSum, rStatus.mSum), lStatus.rSum + rStatus.lSum);
        int iSum = lStatus.iSum + rStatus.iSum;
        return new Status(lSum, rSum, mSum, iSum);
    }
}