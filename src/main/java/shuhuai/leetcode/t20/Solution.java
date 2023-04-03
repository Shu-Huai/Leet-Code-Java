package shuhuai.leetcode.t20;

import java.util.Stack;

public class Solution {
    protected boolean isLeft(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    protected boolean isMatch(char left, char right) {
        return left == '(' && right == ')' || left == '[' && right == ']' || left == '{' && right == '}';
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (isLeft(cur)) {
                stack.add(cur);
            } else {
                if (stack.empty() || !isMatch(stack.pop(), cur)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}