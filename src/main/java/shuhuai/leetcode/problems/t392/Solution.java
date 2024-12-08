package shuhuai.leetcode.problems.t392;

public class Solution {
    public boolean isSubsequenceSimple(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public boolean isSubsequenceDynamic(String s, String t) {
        int[][] dp = new int[t.length() + 1][26];
        for (int i = 0; i < 26; i++) {
            dp[t.length()][i] = t.length();
        }
        for (int i = t.length() - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (t.charAt(i) - 'a' == j) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (dp[j][s.charAt(i) - 'a'] == t.length()) {
                return false;
            }
            j = dp[j][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }
}