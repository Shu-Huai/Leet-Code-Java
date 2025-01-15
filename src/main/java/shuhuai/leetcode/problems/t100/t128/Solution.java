package shuhuai.leetcode.problems.t100.t128;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public int longestConsecutiveSort(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        int cur = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                cur++;
            } else if (nums[i] != nums[i - 1]) {
                max = Math.max(max, cur);
                cur = 1;
            }
        }
        return Math.max(max, cur);
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cur = 1;
                while (set.contains(num + 1)) {
                    num++;
                    cur++;
                }
                max = Math.max(max, cur);
            }
        }
        return max;
    }
}