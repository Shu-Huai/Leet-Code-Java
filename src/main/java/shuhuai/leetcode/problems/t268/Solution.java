package shuhuai.leetcode.problems.t268;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        for (int elem : nums) {
            sum -= elem;
        }
        return sum;
    }
}