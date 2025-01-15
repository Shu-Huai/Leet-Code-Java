package shuhuai.leetcode.problems.t900.t997;

public class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] candidates = new int[n];
        int[] trusted = new int[n];
        for (int[] item : trust) {
            candidates[item[0] - 1]++;
            trusted[item[1] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (candidates[i] == 0 && trusted[i] == n - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}