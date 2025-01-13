package shuhuai.leetcode.problems.t316;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                while (!sb.isEmpty() && sb.charAt(sb.length() - 1) > c) {
                    if (map.get(sb.charAt(sb.length() - 1)) == 0) {
                        break;
                    }
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.append(c);
            }
            map.put(c, map.get(c) - 1);
        }
        return sb.toString();
    }
}