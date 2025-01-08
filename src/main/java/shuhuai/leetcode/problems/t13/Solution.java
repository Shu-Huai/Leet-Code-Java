package shuhuai.leetcode.problems.t13;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (i < s.length() - 1) {
                char next = s.charAt(i + 1);
                if (cur == 'I' && (next == 'V' || next == 'X') || cur == 'X' && (next == 'L' || next == 'C')
                        || cur == 'C' && (next == 'D' || next == 'M')) {
                    sum -= map.get(cur);
                } else {
                    sum += map.get(cur);
                }
            } else {
                sum += map.get(cur);
            }
        }
        return sum;
    }
}