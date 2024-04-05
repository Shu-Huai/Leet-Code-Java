package shuhuai.leetcode.problems.t58;

public class Solution {
    public int lengthOfLastWord(String s) {
        boolean begin = false;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && begin) {
                break;
            }
            if (s.charAt(i) != ' ') {
                begin = true;
                result++;
            }
        }
        return result;
    }
}