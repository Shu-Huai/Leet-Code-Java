package shuhuai.leetcode.problems.t17;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().letterCombinations(input));
            input = scanner.nextLine();
        }
    }
}