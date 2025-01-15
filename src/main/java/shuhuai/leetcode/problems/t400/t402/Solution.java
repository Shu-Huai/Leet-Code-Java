package shuhuai.leetcode.problems.t400.t402;

public class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : num.toCharArray()) {
            while (!sb.isEmpty() && sb.charAt(sb.length() - 1) > c && count < k) {
                sb.deleteCharAt(sb.length() - 1);
                count++;
            }
            if (sb.isEmpty() && c == '0') {
                continue;
            }
            sb.append(c);
        }
        while (count < k && !sb.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
            count++;
        }
        if (sb.isEmpty()) {
            return "0";
        }
        return sb.toString();
    }
}