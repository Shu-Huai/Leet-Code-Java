package shuhuai.leetcode.problems.t290;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        if (pattern.length() != split.length) {
            return false;
        }
        Map<Character, String> patternToS = new HashMap<>();
        Map<String, Character> sToPattern = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (patternToS.containsKey(pattern.charAt(i))) {
                if (!patternToS.get(pattern.charAt(i)).equals(split[i])) {
                    return false;
                }
            } else if (sToPattern.containsKey(split[i])) {
                if (sToPattern.get(split[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                patternToS.put(pattern.charAt(i), split[i]);
                sToPattern.put(split[i], pattern.charAt(i));
            }
        }
        return true;
    }
}