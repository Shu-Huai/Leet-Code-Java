package shuhuai.leetcode.problems.t200.t283;

public class Solution {
    public void moveZeroes(int[] nums) {
        int insert = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insert] = nums[i];
                insert++;
            }
        }
        for (int i = insert; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}