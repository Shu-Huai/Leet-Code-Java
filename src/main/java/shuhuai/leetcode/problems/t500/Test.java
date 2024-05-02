package shuhuai.leetcode.problems.t500;

import shuhuai.leetcode.utils.Printer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] words = input.split(" ");
            String[] result = new Solution().findWords(words);
            new Printer<String>().printArray(result);
            input = sc.nextLine();
        }
    }
}