package shuhuai.leetcode.problems.t94;

import shuhuai.leetcode.utils.TreeHelper;

import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            TreeNode root;
            try {
                root = new TreeHelper<>(TreeNode.class).build(split);
            } catch (Exception e) {
                throw new RuntimeException();
            }
            List<Integer> result = new Solution().inorderTraversal(root);
            for (Integer item : result) {
                System.out.print(item + " ");
            }
            System.out.println();
            input = scanner.nextLine();
        }
    }
}