package shuhuai.leetcode.problems.t600.t674;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLen = 0;
        int curLen = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                curLen++;
            } else {
                maxLen = Math.max(maxLen, curLen);
                curLen = 1;
            }
        }
        maxLen = Math.max(maxLen, curLen);
        return maxLen;
    }
}