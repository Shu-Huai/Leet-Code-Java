package shuhuai.leetcode.problems.t0.t9;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int sum = 0;
        int temp = x;
        while (temp != 0) {
            sum = sum * 10 + (temp % 10);
            temp /= 10;
        }
        return sum == x;
    }
}