package shuhuai.leetcode.problems.t151;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.strip().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].isBlank()) {
                continue;
            }
            sb.append(words[i]).append(" ");
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}