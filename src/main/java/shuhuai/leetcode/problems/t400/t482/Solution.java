package shuhuai.leetcode.problems.t400.t482;

public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '-') {
                continue;
            }
            sb.append(Character.toUpperCase(c));
            if (count == k - 1) {
                sb.append("-");
            }
            count = (count + 1) % k;
        }
        if (!sb.isEmpty() && sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.reverse().toString();
    }
}