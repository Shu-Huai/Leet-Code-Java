package shuhuai.leetcode.problems.t400.t485;

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
            System.out.println(new Solution().findMaxConsecutiveOnes(nums));
            input = sc.nextLine();
        }
    }
}