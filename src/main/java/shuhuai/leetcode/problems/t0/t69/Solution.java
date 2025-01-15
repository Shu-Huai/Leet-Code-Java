package shuhuai.leetcode.problems.t0.t69;

public class Solution {
    public int mySqrtMath(int x) {
        if (x == 0) {
            return 0;
        }
        int ans = (int) Math.exp(0.5 * Math.log(x));
        return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }

    public int mySqrtBinary(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public int mySqrtNewtown(int x) {
        if (x == 0) {
            return 0;
        }
        double temp = x;
        while (true) {
            double xi = 0.5 * (temp + (double) x / temp);
            if (Math.abs(temp - xi) < 1e-7) {
                break;
            }
            temp = xi;
        }
        return (int) temp;
    }
}