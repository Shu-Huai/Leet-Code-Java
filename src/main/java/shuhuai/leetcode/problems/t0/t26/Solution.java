package shuhuai.leetcode.problems.t0.t26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        while (i < nums.length) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}