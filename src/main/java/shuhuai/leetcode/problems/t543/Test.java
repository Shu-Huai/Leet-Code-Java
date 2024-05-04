package shuhuai.leetcode.problems.t543;

import shuhuai.leetcode.utils.TreeHelper;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            TreeNode root;
            try {
                root = new TreeHelper<>(TreeNode.class).build(split);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(new Solution().diameterOfBinaryTree(root));
            input = sc.nextLine();
        }
    }
}