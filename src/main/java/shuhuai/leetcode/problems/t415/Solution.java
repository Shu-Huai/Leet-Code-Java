package shuhuai.leetcode.problems.t415;

public class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int x = 0;
            if (i >= 0) {
                x = num1.charAt(i) - '0';
            }
            int y = 0;
            if (j >= 0) {
                y = num2.charAt(j) - '0';
            }
            int result = x + y + carry;
            sb.append(result % 10);
            carry = result / 10;
            i--;
            j--;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        sb.reverse();
        return sb.toString();
    }
}