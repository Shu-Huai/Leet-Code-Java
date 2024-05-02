package shuhuai.leetcode.problems.t507;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().checkPerfectNumber(Integer.parseInt(input)));
            input = sc.nextLine();
        }
    }
}