package shuhuai.leetcode.problems.t108;

import shuhuai.leetcode.utils.Printer;
import shuhuai.leetcode.utils.TreeHelper;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] str = input.split(" ");
            int[] nums = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                nums[i] = Integer.parseInt(str[i]);
            }
            TreeNode root = new Solution().sortedArrayToBST(nums);
            try {
                String[] result = new TreeHelper<>(TreeNode.class).deBuild(root);
                new Printer<>().printArray(result);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            input = sc.nextLine();
        }
    }
}