package shuhuai.leetcode.problems.t0.t55;

public class Solution {
    public boolean canJump(int[] nums) {
        int cur = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= cur) {
                cur = i;
            }
        }
        return cur == 0;
    }
}