package shuhuai.leetcode.problems.t198;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().rob(new Inputer().stringToIntArray(input)));
            input = scanner.nextLine();
        }
    }
}