package shuhuai.leetcode.problems.t172;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int n = Integer.parseInt(input);
            System.out.println(new Solution().trailingZeroes(n));
            System.out.println(new Solution().trailingZeroesClever(n));
            input = scanner.nextLine();
        }
    }
}