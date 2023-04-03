package shuhuai.leetcode.t217;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int elem : nums) {
            if (set.contains(elem)) {
                return true;
            }
            set.add(elem);
        }
        return false;
    }
}
