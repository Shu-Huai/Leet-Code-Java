package shuhuai.leetcode.problems.t500.t503;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElementsStupid(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = (i + 1) % nums.length;
            while (j != i) {
                if (nums[j] > nums[i]) {
                    result[i] = nums[j];
                    break;
                }
                j = (j + 1) % nums.length;
            }
            if (j == i) {
                result[i] = -1;
            }
        }
        return result;
    }

    public int[] nextGreaterElementsMonotonicStack(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length * 2 - 1; i++) {
            while (!stack.empty() && nums[stack.peek()] < nums[i % nums.length]) {
                result[stack.pop()] = nums[i % nums.length];
            }
            stack.push(i % nums.length);
        }
        return result;
    }
}