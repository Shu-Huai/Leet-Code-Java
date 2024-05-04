package shuhuai.leetcode.problems.t551;

public class Solution {
    public boolean checkRecord(String s) {
        int late = 0;
        boolean absent = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                if (absent) {
                    return false;
                }
                absent = true;
            }
            if (s.charAt(i) == 'L') {
                late++;
                if (late == 3) {
                    return false;
                }
            } else {
                late = 0;
            }
        }
        return true;
    }
}