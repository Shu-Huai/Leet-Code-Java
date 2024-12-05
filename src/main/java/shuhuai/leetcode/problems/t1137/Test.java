package shuhuai.leetcode.problems.t1137;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int n = Integer.parseInt(input);
            System.out.println(new Solution().tribonacci(n));
            System.out.println(new Solution().tribonacciClever(n));
            System.out.println(new Solution().tribonacciMatrix(n));
            input = sc.nextLine();
        }
    }
}