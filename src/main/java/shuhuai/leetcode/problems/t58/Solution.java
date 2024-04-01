package shuhuai.leetcode.problems.t58;

public class Solution {
    public int lengthOfLastWord(String s) {
        boolean begin = false;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ' && !begin) {
                begin = true;
                result++;
            } else if (s.charAt(i) != ' ' && begin) {
                result++;
            } else if (s.charAt(i) == ' ' && begin) {
                break;
            }
        }
        return result;
    }
}