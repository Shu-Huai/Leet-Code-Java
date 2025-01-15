package shuhuai.leetcode.problems.t400.t409;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().longestPalindrome(input));
            input = sc.nextLine();
        }
    }
}