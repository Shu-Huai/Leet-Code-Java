package shuhuai.leetcode.problems.t100.t100;

import shuhuai.leetcode.utils.TreeHelper;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            TreeNode[] nodes = new TreeNode[2];
            for (int i = 0; i < 2; i++) {
                String[] str = input.split(" ");
                nodes[i] = null;
                try {
                    nodes[i] = new TreeHelper<>(TreeNode.class).build(str);
                } catch (Exception e) {
                    continue;
                }
                input = sc.nextLine();
            }
            System.out.println(new Solution().isSameTree(nodes[0], nodes[1]));
        }
    }
}