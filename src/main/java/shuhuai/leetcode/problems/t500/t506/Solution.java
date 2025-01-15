package shuhuai.leetcode.problems.t500.t506;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        Arrays.sort(score);
        String[] out = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        String[] result = new String[score.length];
        for (int i = score.length - 1; i >= 0; i--) {
            if (i >= score.length - 3) {
                result[map.get(score[i])] = out[score.length - 1 - i];
            } else {
                result[map.get(score[i])] = String.valueOf(score.length - i);
            }
        }
        return result;
    }
}