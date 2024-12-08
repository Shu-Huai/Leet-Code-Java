package shuhuai.leetcode.problems.t134;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int begin = 0;
        int left = 0;
        for (int i = 0; i < gas.length; i++) {
            left += gas[i] - cost[i];
            if (left < 0) {
                begin = i + 1;
                left = 0;
            }
        }
        for (int i = 0; i < begin; i++) {
            left += gas[i] - cost[i];
            if (left < 0) {
                return -1;
            }
        }
        return begin;
    }
}