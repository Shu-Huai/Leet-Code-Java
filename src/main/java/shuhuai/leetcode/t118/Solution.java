package shuhuai.leetcode.t118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            if (i == 0) {
                cur.add(1);
            } else {
                for (int j = 0; j <= i; j++) {
                    int startValue;
                    if (j == 0) {
                        startValue = 0;
                    } else {
                        startValue = result.get(i - 1).get(j - 1);
                    }
                    int endValue;
                    if (j == i) {
                        endValue = 0;
                    } else {
                        endValue = result.get(i - 1).get(j);
                    }
                    cur.add(startValue + endValue);
                }
            }
            result.add(cur);
        }
        return result;
    }

    public static void main(String[] args) {
        new Solution().generate(5);
    }
}