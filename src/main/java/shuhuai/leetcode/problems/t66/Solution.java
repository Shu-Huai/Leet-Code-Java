package shuhuai.leetcode.problems.t66;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9, 9, 9})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{0})));
    }

    public int[] plusOne(int[] digits, int length) {
        if (length == 0) {
            int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = 1;
            return result;
        }
        digits[length - 1]++;
        if (digits[length - 1] == 10) {
            digits[length - 1] = 0;
            return plusOne(digits, length - 1);
        }
        return digits;
    }

    public int[] plusOne(int[] digits) {
        return plusOne(digits, digits.length);
    }
}