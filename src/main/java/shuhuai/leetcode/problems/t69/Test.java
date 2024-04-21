package shuhuai.leetcode.problems.t69;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int x = Integer.parseInt(input);
            Solution solution = new Solution();
            System.out.println(solution.mySqrtMath(x));
            System.out.println(solution.mySqrtBinary(x));
            System.out.println(solution.mySqrtNewtown(x));
            input = sc.nextLine();
        }
    }
}