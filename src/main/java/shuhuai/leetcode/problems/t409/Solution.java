package shuhuai.leetcode.problems.t409;

public class Solution {
    public int longestPalindrome(String s) {
        int[] letter = new int[128];
        for(char c : s.toCharArray()) {
            letter[c]++;
        }
        int count = 0;
        for (int i : letter) {
            count += (i % 2);
        }
        return count == 0 ? s.length() : (s.length() - count + 1);
    }
}