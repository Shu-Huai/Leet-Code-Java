package shuhuai.leetcode.problems.t543;

public class Solution {
    private int max;

    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        depth(root);
        return max - 1;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        max = Math.max(max, left + right + 1);
        return Math.max(left, right) + 1;
    }
}