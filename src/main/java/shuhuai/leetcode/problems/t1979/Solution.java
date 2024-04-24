package shuhuai.leetcode.problems.t1979;

public class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        while (min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }
        return max;
    }
}