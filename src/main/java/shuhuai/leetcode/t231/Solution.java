package shuhuai.leetcode.t231;

public class Solution {
    public boolean isPowerOfTwoSimple(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        while (true) {
            if (n % 2 == 0) {
                n /= 2;
                if (n == 1) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    boolean isPowerOfTwoClever(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}