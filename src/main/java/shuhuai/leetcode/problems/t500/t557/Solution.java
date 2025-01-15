package shuhuai.leetcode.problems.t500.t557;

public class Solution {
    public String reverseWords(String s) {
        int length = s.length();
        int i = 0;
        char[] chars = s.toCharArray();
        while (i < length) {
            int left = i;
            while (i < length && chars[i] != ' ') {
                i++;
            }
            int right = i - 1;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            while (i < length && chars[i] == ' ') {
                i++;
            }
        }
        return new String(chars);
    }
}