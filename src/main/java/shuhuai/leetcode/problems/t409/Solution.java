package shuhuai.leetcode.problems.t409;

public class Solution {
    public int longestPalindrome(String s) {
        int[] counts = new int[128];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
        }
        int count = 0;
        for (int j : counts) {
            if (j % 2 == 1) {
                count++;
            }
        }
        if (count == 0) {
            return s.length();
        }
        return s.length() - count + 1;
    }
}