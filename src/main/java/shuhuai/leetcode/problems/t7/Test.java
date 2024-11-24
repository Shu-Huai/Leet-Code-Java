package shuhuai.leetcode.problems.t7;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().reverse(Integer.parseInt(input)));
            input = scanner.nextLine();
        }
    }
}