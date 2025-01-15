package shuhuai.leetcode.problems.t500.t530;

public class Solution {
    private int pre;
    private int min;

    public int getMinimumDifference(TreeNode root) {
        pre = -1;
        min = Integer.MAX_VALUE;
        mid(root);
        return min;
    }

    public void mid(TreeNode root) {
        if (root == null) {
            return;
        }
        mid(root.left);
        if (pre != -1) {
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        mid(root.right);
    }
}