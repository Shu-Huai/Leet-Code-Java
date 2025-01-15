package shuhuai.leetcode.problems.t200.t209;

import java.util.Arrays;

public class Solution {
    public int minSubArrayLenBinary(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int[] sums = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        for (int i = 1; i <= nums.length; i++) {
            int s = target + sums[i - 1];
            int bound = Arrays.binarySearch(sums, s);
            if (bound < 0) {
                bound = -bound - 1;
            }
            if (bound <= nums.length) {
                ans = Math.min(ans, bound - (i - 1));
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}