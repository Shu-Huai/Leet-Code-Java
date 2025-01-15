package shuhuai.leetcode.problems.t100.t162;

public class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int midLeft = mid == 0 ? Integer.MIN_VALUE : nums[mid - 1];
            int midRight = mid == nums.length - 1 ? Integer.MIN_VALUE : nums[mid + 1];
            if (nums[mid] > midLeft && nums[mid] > midRight) {
                return mid;
            }
            if (nums[mid] <= midRight) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}