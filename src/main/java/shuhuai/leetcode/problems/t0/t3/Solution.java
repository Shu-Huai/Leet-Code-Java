package shuhuai.leetcode.problems.t0.t3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while (j != s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
            } else {
                set.remove(s.charAt(i));
                max = Math.max(max, j - i);
                i++;
            }
        }
        return Math.max(max, j - i);
    }
}