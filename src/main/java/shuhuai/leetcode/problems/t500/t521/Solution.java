package shuhuai.leetcode.problems.t500.t521;

public class Solution {
    public int findLUSlength(String a, String b) {
        return !a.equals(b) ? Math.max(a.length(), b.length()) : -1;
    }
}