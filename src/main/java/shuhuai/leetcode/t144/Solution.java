package shuhuai.leetcode.t144;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversalSimple(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
}
