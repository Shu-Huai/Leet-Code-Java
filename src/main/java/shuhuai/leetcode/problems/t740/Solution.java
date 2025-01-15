package shuhuai.leetcode.problems.t740;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] dp = new int[max + 1];
        for (int num : nums) {
            dp[num] += num;
        }
        int a = dp[0], b = dp[1];
        for (int i = 2; i <= max; i++) {
            int c = Math.max(b, a + dp[i]);
            a = b;
            b = c;
        }
        return b;
    }

    public int deleteAndEarnClever(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Arrays.sort(nums);
        List<Integer> sum = new ArrayList<>();
        sum.add(nums[0]);
        int size = 1;
        for (int i = 1; i < n; ++i) {
            int val = nums[i];
            if (val == nums[i - 1]) {
                sum.set(size - 1, sum.get(size - 1) + val);
            } else if (val == nums[i - 1] + 1) {
                sum.add(val);
                ++size;
            } else {
                ans += rob(sum);
                sum.clear();
                sum.add(val);
                size = 1;
            }
        }
        ans += rob(sum);
        return ans;
    }

    public int rob(List<Integer> nums) {
        int size = nums.size();
        if (size == 1) {
            return nums.getFirst();
        }
        int first = nums.get(0);
        int second = Math.max(nums.get(0), nums.get(1));
        for (int i = 2; i < size; i++) {
            int temp = second;
            second = Math.max(first + nums.get(i), second);
            first = temp;
        }
        return second;
    }
}