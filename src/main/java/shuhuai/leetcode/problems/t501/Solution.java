package shuhuai.leetcode.problems.t501;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private int max;

    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        findMode(root, map, list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public void findMode(TreeNode root, Map<Integer, Integer> map, List<Integer> list) {
        if (root == null) {
            return;
        }
        findMode(root.left, map, list);
        int cur = map.getOrDefault(root.val, 0) + 1;
        map.put(root.val, cur);
        if (cur > max) {
            max = cur;
            list.clear();
            list.add(root.val);
        } else if (cur == max) {
            list.add(root.val);
        }
        findMode(root.right, map, list);
    }
}