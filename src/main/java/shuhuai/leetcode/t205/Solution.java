package shuhuai.leetcode.t205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((sToT.containsKey(x) && sToT.get(x) != y) || (tToS.containsKey(y) && tToS.get(y) != x)) {
                return false;
            }
            sToT.put(x, y);
            tToS.put(y, x);
        }
        return true;
    }
}
