package shuhuai.leetcode.problems.t0.t71;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String simplifyPath(String path) {
        List<String> list = new ArrayList<>();
        String[] str = path.split("/");
        for (String s : str) {
            if (s.equals("..")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                }
            } else if (!s.equals(".") && !s.isEmpty()) {
                list.add(s);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String s : list) {
            result.append("/").append(s);
        }
        return result.isEmpty() ? "/" : result.toString();
    }
}