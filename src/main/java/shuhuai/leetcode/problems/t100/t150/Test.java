package shuhuai.leetcode.problems.t100.t150;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().evalRPN(input.split(" ")));
            input = scanner.nextLine();
        }
    }
}