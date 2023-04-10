package shuhuai.leetcode.t258;

public class Solution {
    public int addDigitsLoop(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public int addDigitsMath(int num) {
        return (num - 1) % 9 + 1;
    }
}