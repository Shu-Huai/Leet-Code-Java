package shuhuai.leetcode.problems.t0.t20;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().isValid(input));
            input = sc.nextLine();
        }
    }
}