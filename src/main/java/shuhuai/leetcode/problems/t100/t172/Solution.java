package shuhuai.leetcode.problems.t100.t172;

public class Solution {
    public int trailingZeroes(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int cur = i;
            while (cur % 5 == 0) {
                sum++;
                cur /= 5;
            }
        }
        return sum;
    }

    public int trailingZeroesClever(int n) {
        int sum = 0;
        while (n != 0) {
            n /= 5;
            sum += n;
        }
        return sum;
    }
}