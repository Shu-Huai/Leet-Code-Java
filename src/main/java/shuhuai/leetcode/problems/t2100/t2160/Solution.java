package shuhuai.leetcode.problems.t2100.t2160;

import java.util.Arrays;

public class Solution {
    public int minimumSum(int num) {
        if (num == 0) {
            return 0;
        }
        int count = 0;
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        int[] nums = new int[count];
        int zeroCount = 0;
        for (int i = count - 1; i >= 0; i--) {
            nums[i] = num % 10;
            if (nums[i] == 0) {
                zeroCount++;
            }
            num /= 10;
        }
        Arrays.sort(nums);
        int left = 0;
        for (int i = zeroCount; i < count; i += 2) {
            left = left * 10 + nums[i];
        }
        int right = 0;
        for (int i = zeroCount + 1; i < count; i += 2) {
            right = right * 10 + nums[i];
        }
        return left + right;
    }
}