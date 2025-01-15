package shuhuai.leetcode.problems.t100.t125;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().isPalindrome(input));
            input = scanner.nextLine();
        }
    }
}