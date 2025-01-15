package shuhuai.leetcode.problems.t400.t461;

public class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += Math.abs((x & 1) - (y & 1));
            x >>>= 1;
            y >>>= 1;
        }
        return count;
    }
}