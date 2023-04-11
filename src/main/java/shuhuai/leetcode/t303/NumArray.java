package shuhuai.leetcode.t303;

public class NumArray {
    protected int[] elems;
    protected int[] sums;

    public NumArray(int[] nums) {
        elems = new int[nums.length];
        System.arraycopy(nums, 0, elems, 0, nums.length);
        sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
    }

    public int sumRangeSlow(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += elems[i];
        }
        return sum;
    }

    public int sumRangeFast(int left, int right) {
        if (left == 0) {
            return sums[right];
        }
        return sums[right] - sums[left - 1];
    }
}