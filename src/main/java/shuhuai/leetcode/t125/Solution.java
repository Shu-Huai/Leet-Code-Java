package shuhuai.leetcode.t125;

public class Solution {
    public boolean isOther(char c) {
        return !Character.isLetter(c) && !Character.isDigit(c);
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (isOther(s.charAt(left))) {
                left++;
                continue;
            }
            if (isOther(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
