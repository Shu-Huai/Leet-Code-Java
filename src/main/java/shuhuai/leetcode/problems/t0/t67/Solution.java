package shuhuai.leetcode.problems.t0.t67;

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int cur = carry;
            if (i >= 0) {
                cur += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                cur += b.charAt(j--) - '0';
            }
            if (cur >= 2) {
                carry = 1;
            } else {
                carry = 0;
            }
            sb.append(cur % 2);
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}