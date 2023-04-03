package shuhuai.leetcode.t14;

public class Solution {
    protected String getPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int max = 0;
        while (max < length && str1.charAt(max) == str2.charAt(max)) {
            max++;
        }
        return str1.substring(0, max);
    }

    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (String str : strs) {
            result = getPrefix(result, str);
        }
        return result;
    }
}