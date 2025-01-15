package shuhuai.leetcode.problems.t0.t11;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String[] nums = input.split(" ");
            int[] height = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                height[i] = Integer.parseInt(nums[i]);
            }
            System.out.println(new Solution().maxArea(height));
            input = scanner.nextLine();
        }
    }
}