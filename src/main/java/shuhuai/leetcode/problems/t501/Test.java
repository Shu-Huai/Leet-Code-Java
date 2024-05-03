package shuhuai.leetcode.problems.t501;

import shuhuai.leetcode.utils.Printer;
import shuhuai.leetcode.utils.TreeHelper;

import java.util.Arrays;
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
            int[] result = new Solution().findMode(root);
            new Printer<Integer>().printArray(Arrays.stream(result).boxed().toArray(Integer[]::new));
            input = sc.nextLine();
        }
    }
}