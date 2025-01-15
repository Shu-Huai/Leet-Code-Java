package shuhuai.leetcode.problems.t0.t13;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().romanToInt(input));
            input = scanner.nextLine();
        }
    }
}