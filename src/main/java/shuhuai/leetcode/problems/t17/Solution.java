package shuhuai.leetcode.problems.t17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) {
            return result;
        }
        Map<Character, String> map = new HashMap<>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(result, map, digits, 0, new StringBuffer());
        return result;
    }

    public void backtrack(List<String> result, Map<Character, String> map, String digits, int index, StringBuffer sb) {
        if (index == digits.length()) {
            result.add(sb.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = map.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                sb.append(letters.charAt(i));
                backtrack(result, map, digits, index + 1, sb);
                sb.deleteCharAt(index);
            }
        }
    }
}