package shuhuai.leetcode.problems.t26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int cur = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != cur) {
                nums[j] = nums[i];
                j++;
                cur = nums[i];
            }
        }
        return j;
    }
}