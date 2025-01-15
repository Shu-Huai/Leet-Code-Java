package shuhuai.leetcode.problems.t600.t643;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += nums[i];
        }
        int sum = max;
        for (int i = 1; i <= nums.length - k; i++) {
            sum -= nums[i - 1];
            sum += nums[i + k - 1];
            max = Math.max(sum, max);
        }
        return (double) max / k;
    }
}