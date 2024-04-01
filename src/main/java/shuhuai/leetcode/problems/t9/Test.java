package shuhuai.leetcode.problems.t9;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int x = Integer.parseInt(input);
            System.out.println(new Solution().isPalindrome(x));
            input = scanner.nextLine();
        }
    }
}