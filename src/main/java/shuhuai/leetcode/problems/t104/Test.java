package shuhuai.leetcode.problems.t104;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] str = input.split(" ");
            TreeNode root = null;
            Queue<TreeNode> queue = new LinkedList<>();
            if (str.length > 0) {
                root = new TreeNode(Integer.parseInt(str[0]));
            }
            queue.offer(root);
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
            System.out.println(new Solution().maxDepth(root));
            input = sc.nextLine();
        }
    }
}