package shuhuai.leetcode.problems.t69;

public class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) mid * mid <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}