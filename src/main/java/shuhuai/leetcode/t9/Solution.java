package shuhuai.leetcode.t9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        List<Integer> set = new ArrayList<>();
        while (x != 0) {
            set.add(x % 10);
            x /= 10;
        }
        for (int i = 0; i < set.size() / 2; i++) {
            if (!Objects.equals(set.get(i), set.get(set.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}