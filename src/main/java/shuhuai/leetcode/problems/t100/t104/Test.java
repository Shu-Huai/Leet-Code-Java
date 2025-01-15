package shuhuai.leetcode.problems.t100.t104;

import shuhuai.leetcode.utils.TreeHelper;

import java.util.Scanner;

public class Test {
    public void test() throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] str = input.split(" ");
            TreeHelper<TreeNode> treeHelper = new TreeHelper<>(TreeNode.class);
            TreeNode root = treeHelper.build(str);
            System.out.println(new Solution().maxDepth(root));
            input = sc.nextLine();
        }
    }
}