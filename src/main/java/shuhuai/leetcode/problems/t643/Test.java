package shuhuai.leetcode.problems.t643;

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
            int k = Integer.parseInt(sc.nextLine());
            System.out.println(new Solution().findMaxAverage(nums, k));
            input = sc.nextLine();
        }
    }
}