package shuhuai.leetcode.problems.t0.t5;


import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().longestPalindromeDp(input));
            System.out.println(new Solution().longsetPalindromeClever(input));
            System.out.println(new Solution().longestPalindromeManacher(input));
            input = scanner.nextLine();
        }
    }
}