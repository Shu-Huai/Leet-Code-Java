package shuhuai.leetcode.problems.t300.t367;

public class Solution {
    public boolean isPerfectSquareLoop(int num) {
        long x = 1;
        long square = 1;
        while (square <= num) {
            if (square == num) {
                return true;
            }
            x++;
            square = x * x;
        }
        return false;
    }

    public boolean isPerfectSquareBinary(int num) {
        int low = 0;
        int high = num;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            long square = (long) mid * mid;
            if (square < num) {
                low = mid + 1;
            } else if (square > num) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}