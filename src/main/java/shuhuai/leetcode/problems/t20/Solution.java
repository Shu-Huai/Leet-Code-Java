package shuhuai.leetcode.problems.t20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (map.containsKey(cur)) {
                stack.add(cur);
            } else {
                if (stack.empty() || cur != map.get(stack.pop())) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}