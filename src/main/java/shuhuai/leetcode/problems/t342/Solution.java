package shuhuai.leetcode.problems.t342;

public class Solution {
    public boolean isPowerOfFourLoop(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 4 == 0) {
                n /= 4;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPowerOfFourBin(int n){
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }

    public boolean isPowerOfFourMod(int n){
        return (n & (n - 1)) == 0 && n % 3 == 1;
    }
}
