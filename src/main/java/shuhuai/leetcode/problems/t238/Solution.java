package shuhuai.leetcode.problems.t238;

public class Solution {
    public int[] productExceptSelfDivide(int[] nums) {
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            }
        }
        if (zeroCount > 1) {
            return new int[nums.length];
        }
        if (zeroCount == 1) {
            int[] res = new int[nums.length];
            int product = 1;
            for (int num : nums) {
                if (num != 0) {
                    product *= num;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    res[i] = product;
                }
            }
            return res;
        }
        int[] res = new int[nums.length];
        int total = 1;
        for (int num : nums) {
            total *= num;
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = total / nums[i];
        }
        return res;
    }

    public int[] productExceptSelfClever(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right *= nums[i];
        }
        return res;
    }
}