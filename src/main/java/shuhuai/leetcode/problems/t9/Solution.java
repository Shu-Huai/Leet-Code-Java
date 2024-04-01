package shuhuai.leetcode.problems.t9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public boolean isPalindrome(int x) {
        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x /= 10;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Objects.equals(list.get(i), list.get(list.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}