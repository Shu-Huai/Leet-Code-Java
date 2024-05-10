package shuhuai.leetcode.problems.t617;

import shuhuai.leetcode.utils.Printer;
import shuhuai.leetcode.utils.TreeHelper;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            TreeNode root1;
            try {
                root1 = new TreeHelper<>(TreeNode.class).build(split);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            split = sc.nextLine().split(" ");
            TreeNode root2;
            try {
                root2 = new TreeHelper<>(TreeNode.class).build(split);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            TreeNode result = new Solution().mergeTrees(root1, root2);
            try {
                split = new TreeHelper<>(TreeNode.class).deBuild(result);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            new Printer<String>().printArray(split);
            input = sc.nextLine();
        }
    }
}