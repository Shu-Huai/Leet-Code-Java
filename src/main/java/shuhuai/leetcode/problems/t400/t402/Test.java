package shuhuai.leetcode.problems.t400.t402;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String nums = input;
            input = scanner.nextLine();
            int k = Integer.parseInt(input);
            System.out.println(new Solution().removeKdigits(nums, k));
            input = scanner.nextLine();
        }
    }
}