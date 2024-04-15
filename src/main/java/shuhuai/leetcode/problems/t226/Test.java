package shuhuai.leetcode.problems.t226;

import java.util.*;

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
            root = new Solution().invertTree(root);
            queue.clear();
            List<String> result = new ArrayList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                if (current != null) {
                    result.add(String.valueOf(current.val));
                    queue.offer(current.left);
                    queue.offer(current.right);
                } else {
                    result.add("null");
                }
            }
            System.out.println(result);
            input = sc.nextLine();
        }
    }
}