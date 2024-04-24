package shuhuai.leetcode.problems.t118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            Integer[] cur = new Integer[i + 1];
            cur[0] = 1;
            cur[i] = 1;
            for (int j = 1; j < i; j++) {
                cur[j] = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
            }
            result.add(new ArrayList<>(Arrays.asList(cur)));
        }
        return result;
    }
}