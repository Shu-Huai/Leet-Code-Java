package shuhuai.leetcode.problems.t0.t56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int begin = intervals[0][0];
        int end = intervals[0][1];
        for (int[] interval : intervals) {
            if (interval[0] <= end) {
                end = Math.max(end, interval[1]);
            } else {
                result.add(new int[]{begin, end});
                begin = interval[0];
                end = interval[1];
            }
        }
        result.add(new int[]{begin, end});
        return result.toArray(new int[result.size()][2]);
    }
}
