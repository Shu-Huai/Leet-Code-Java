package shuhuai.leetcode.problems.t226;

import shuhuai.leetcode.utils.Printer;
import shuhuai.leetcode.utils.TreeHelper;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] str = input.split(" ");
            TreeNode root;
            try {
                root = new TreeHelper<>(TreeNode.class).build(str);
            } catch (Exception e) {
                continue;
            }
            root = new Solution().invertTree(root);
            String[] result;
            try {
                result = new TreeHelper<>(TreeNode.class).deBuild(root);
            } catch (Exception e) {
                continue;
            }
            new Printer<String>().printArray(result);
            input = sc.nextLine();
        }
    }
}