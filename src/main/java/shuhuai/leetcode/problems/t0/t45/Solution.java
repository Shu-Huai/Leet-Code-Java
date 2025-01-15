package shuhuai.leetcode.problems.t0.t45;

public class Solution {
    public int jumpGreedy(int[] nums) {
        int ans = 0;
        int left = nums.length - 1;
        while (left > 0) {
            for (int i = 0; i < left; i++) {
                if (i + nums[i] >= left) {
                    left = i;
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }

    public int jumpClever(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}