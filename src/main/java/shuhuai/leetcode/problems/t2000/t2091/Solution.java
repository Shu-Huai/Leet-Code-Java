package shuhuai.leetcode.problems.t2000.t2091;

public class Solution {
    public int minimumDeletions(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        int left = Math.min(maxIndex, minIndex);
        int right = Math.max(maxIndex, minIndex);
        return Math.min(
                (left + 1) + Math.min(right - left, nums.length - right),
                nums.length - right + Math.min(left + 1, right - left)
        );
    }
}