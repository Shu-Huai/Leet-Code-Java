package shuhuai.leetcode.problems.t100;

import java.util.LinkedList;
import java.util.Queue;
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
                Queue<TreeNode> queue = new LinkedList<>();
                if (str.length > 0) {
                    nodes[i] = new TreeNode(Integer.parseInt(str[0]));
                }
                queue.offer(nodes[i]);
                int index = 1;
                while (!queue.isEmpty() && index < str.length) {
                    TreeNode current = queue.poll();
                    if (!str[index].equals("null")) {
                        current.left = new TreeNode(Integer.parseInt(str[index]));
                        queue.offer(current.left);
                    }
                    index++;
                    if (index < str.length && !str[index].equals("null")) {
                        current.right = new TreeNode(Integer.parseInt(str[index]));
                        queue.offer(current.right);
                    }
                    index++;
                }
                if (i != 1) {
                    input = sc.nextLine();
                }
            }
            System.out.println(new Solution().isSameTree(nodes[0], nodes[1]));
            input = sc.nextLine();
        }
    }
}