package shuhuai.leetcode.problems.t189;

public class Solution {
    public void rotateStupid(int[] nums, int k) {
        k = k % nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    public void rotateReverse(int[] nums, int k) {
        k = k % nums.length;
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        for (int i = 0; i < k / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k - 1 - i];
            nums[k - 1 - i] = temp;
        }
        for (int i = k; i < (nums.length + k) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i + k];
            nums[nums.length - 1 - i + k] = temp;
        }
    }

    public void rotateClever(int[] nums, int k) {
        int start =0;
        k = k % nums.length;
        int count = 0;
        while (count < nums.length) {
            int index = start;
            int pre = nums[index];
            do {
                index = (index + k) % nums.length;
                int temp = nums[index];
                nums[index] = pre;
                pre = temp;
                count++;
            } while (index!= start);
            start++;
        }
    }
}