package shuhuai.leetcode.problems.t228;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int start = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 < nums[i]) {
                if (start == i - 1) {
                    result.add(String.valueOf(nums[i - 1]));
                } else {
                    result.add(nums[start] + "->" + nums[i - 1]);
                }
                start = i;
            }
        }
        if (start == nums.length - 1) {
            result.add(String.valueOf(nums[nums.length - 1]));
        } else if (nums.length > 0) {
            result.add(nums[start] + "->" + nums[nums.length - 1]);
        }
        return result;
    }
}