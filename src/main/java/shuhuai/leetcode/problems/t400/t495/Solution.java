package shuhuai.leetcode.problems.t400.t495;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int begin = timeSeries[0];
        int total = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i - 1] + duration <= timeSeries[i]) {
                total += timeSeries[i - 1] - begin + duration;
                begin = timeSeries[i];
            }
        }
        total += timeSeries[timeSeries.length - 1] - begin + duration;
        return total;
    }
}