package shuhuai.leetcode.problems.t171;

class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            sum += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, columnTitle.length() - i - 1);
        }
        return sum;
    }
}