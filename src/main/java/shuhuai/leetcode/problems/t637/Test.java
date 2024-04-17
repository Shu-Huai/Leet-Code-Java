package shuhuai.leetcode.problems.t637;

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
            System.out.println(new Solution().averageOfLevels(root));
            input = sc.nextLine();
        }
    }
}