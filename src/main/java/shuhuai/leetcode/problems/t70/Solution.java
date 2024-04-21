package shuhuai.leetcode.problems.t70;

public class Solution {
    public int climbStairs(int n) {
        int q = 0;
        int r = 1;
        for (int i = 1; i <= n; i++) {
            int p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}