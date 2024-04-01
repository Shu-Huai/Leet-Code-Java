package shuhuai.leetcode.problems.t263;

public class Solution {
    public boolean isUglyLoop(int n) {
        if (n <= 0) {
            return false;
        }
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }

    public boolean isUglyRecursive(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }
        if (n % 2 == 0) {
            return isUglyRecursive(n / 2);
        }
        if (n % 3 == 0) {
            return isUglyRecursive(n / 3);
        }
        if (n % 5 == 0) {
            return isUglyRecursive(n / 5);
        }
        return false;
    }
}