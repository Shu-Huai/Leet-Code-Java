package shuhuai.leetcode.problems.t506;

import shuhuai.leetcode.utils.Printer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            int[] score = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                score[i] = Integer.parseInt(split[i]);
            }
            new Printer<String>().printArray(new Solution().findRelativeRanks(score));
            input = sc.nextLine();
        }
    }
}