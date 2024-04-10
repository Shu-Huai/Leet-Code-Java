package shuhuai.leetcode.problems.t219;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            int[] nums = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                nums[i] = Integer.parseInt(split[i]);
            }
            int k = sc.nextInt();
            Solution solution = new Solution();
            System.out.println(solution.containsNearbyDuplicateSimple(nums, k));
            System.out.println(solution.containsNearbyDuplicateClever(nums, k));
            sc.nextLine();
            input = sc.nextLine();
        }
    }
}