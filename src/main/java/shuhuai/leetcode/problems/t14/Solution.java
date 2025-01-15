package shuhuai.leetcode.problems.t14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(strs[0]);
        for (String item : strs) {
            int i = 0;
            while (i < sb.length() && i < item.length() && sb.charAt(i) == item.charAt(i)) {
                i++;
            }
            sb.setLength(i);
        }
        return sb.toString();
    }
}