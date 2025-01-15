package shuhuai.leetcode.problems.t400.t496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int k = j + 1;
                    for (; k < nums2.length; k++) {
                        if (nums1[i] < nums2[k]) {
                            result[i] = nums2[k];
                            break;
                        }
                    }
                    if (k == nums2.length) {
                        result[i] = -1;
                    }
                    break;
                }
            }
        }
        return result;
    }

    public int[] nextGreaterElementClever(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : nums2) {
            while (!stack.empty() && j > stack.peek()) {
                map.put(stack.pop(), j);
            }
            stack.push(j);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}