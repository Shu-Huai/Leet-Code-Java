package shuhuai.leetcode.problems.t500.t572;

import shuhuai.leetcode.utils.TreeHelper;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            TreeNode root;
            try {
                root = new TreeHelper<>(TreeNode.class).build(input.split(" "));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            input = sc.nextLine();
            TreeNode subRoot;
            try {
                subRoot = new TreeHelper<>(TreeNode.class).build(input.split(" "));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(new Solution().isSubtree(root, subRoot));
            input = sc.nextLine();
        }
    }
}