package shuhuai.leetcode.problems.t507;

public class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= Math.pow(num, 0.5); i++) {
            if (num % i == 0) {
                if (num != 1) {
                    sum += i;
                }
                if (i != Math.pow(num, 0.5) && i != 1) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}