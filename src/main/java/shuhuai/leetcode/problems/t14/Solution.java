package shuhuai.leetcode.problems.t14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            boolean good = true;
            for (String str : strs) {
                if (i >= str.length() || str.charAt(i) != strs[0].charAt(i)) {
                    good = false;
                    break;
                }
            }
            if (good) {
                stringBuilder.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return stringBuilder.toString();
    }
}