package shuhuai.leetcode.problems.t228;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int j = i;
            while (j + 1 < nums.length && nums[j] + 1 == nums[j + 1]) {
                j++;
            }
            if (i == j) {
                result.add(String.valueOf(nums[i]));
            } else {
                result.add(nums[i] + "->" + nums[j]);
            }
            i = j + 1;
        }
        return result;
    }
}