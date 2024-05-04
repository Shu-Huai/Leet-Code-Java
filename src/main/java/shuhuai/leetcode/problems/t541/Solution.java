package shuhuai.leetcode.problems.t541;

public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i += 2 * k) {
            StringBuilder temp = new StringBuilder(s.substring(i, Math.min(n, i + k)));
            temp.reverse();
            sb.append(temp);
            sb.append(s, Math.min(i + k, n), Math.min(n, i + 2 * k));
        }
        return sb.toString();
    }
}