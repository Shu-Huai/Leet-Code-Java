package shuhuai.leetcode.problems.t993;

public class Solution {
    private TreeNode xParent;
    private TreeNode yParent;
    private int xDepth;
    private int yDepth;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, 0, null, x, y);
        return xDepth == yDepth && xParent != yParent;
    }

    private void dfs(TreeNode root, int depth, TreeNode parent, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.val == x) {
            xParent = parent;
            xDepth = depth;
        }
        if (root.val == y) {
            yParent = parent;
            yDepth = depth;
        }
        dfs(root.left, depth + 1, root, x, y);
        dfs(root.right, depth + 1, root, x, y);
    }
}