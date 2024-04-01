package shuhuai.leetcode.problems.t326;

public class Solution {
    public boolean isPowerOfThreeLoop(int n) {
        if (n <= 0) {
            return false;
        }
        while (n != 1) {
            if (n % 3 == 0) {
                n /= 3;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPowerOfThreeMAth(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}