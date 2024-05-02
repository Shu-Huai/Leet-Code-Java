package shuhuai.leetcode.problems.t500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] findWords(String[] words) {
        String[] keyboard = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keyboard.length; i++) {
            for (char c : keyboard[i].toCharArray()) {
                map.put(c, i);
            }
        }
        List<String> result = new ArrayList<>();
        for (String item : words) {
            int line = -1;
            boolean good = true;
            for (char c : item.toCharArray()) {
                if (map.get(Character.toLowerCase(c)) != line && line != -1) {
                    good = false;
                    break;
                }
                line = map.get(Character.toLowerCase(c));
            }
            if (good) {
                result.add(item);
            }
        }
        return result.toArray(new String[0]);
    }
}