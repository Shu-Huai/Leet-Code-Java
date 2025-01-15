package shuhuai.leetcode.problems.t100.t151;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().reverseWords(input));
            input = scanner.nextLine();
        }
    }
}