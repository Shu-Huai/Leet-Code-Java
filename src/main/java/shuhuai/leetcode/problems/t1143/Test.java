package shuhuai.leetcode.problems.t1143;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String text1 = input;
            String text2 = scanner.nextLine();
            System.out.println(new Solution().longestCommonSubsequence(text1, text2));
            input = scanner.nextLine();
        }
    }
}