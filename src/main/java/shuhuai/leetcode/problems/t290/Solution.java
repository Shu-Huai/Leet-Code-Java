package shuhuai.leetcode.problems.t290;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> patternToS = new HashMap<>();
        Map<String, Character> sToPattern = new HashMap<>();
        String[] list = s.split(" ");
        if (list.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (patternToS.containsKey(pattern.charAt(i))) {
                if (!list[i].equals(patternToS.get(pattern.charAt(i)))) {
                    return false;
                }
            }
            if (sToPattern.containsKey(list[i])) {
                if (!sToPattern.get(list[i]).equals(pattern.charAt(i))) {
                    return false;
                }
            }
            if (!patternToS.containsKey(pattern.charAt(i)) && !sToPattern.containsKey(list[i])) {
                patternToS.put(pattern.charAt(i), list[i]);
                sToPattern.put(list[i], pattern.charAt(i));
            }
        }
        return true;
    }
}