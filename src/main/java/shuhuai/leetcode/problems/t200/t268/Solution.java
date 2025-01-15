package shuhuai.leetcode.problems.t200.t268;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int item : nums) {
            sum += item;
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }
}