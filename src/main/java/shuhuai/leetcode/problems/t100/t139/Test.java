package shuhuai.leetcode.problems.t100.t139;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String s = input;
            input = scanner.nextLine();
            String[] strs = input.split(" ");
            List<String> wordDict = new ArrayList<>(Arrays.asList(strs));
            System.out.println(new Solution().wordBreak(s, wordDict));
            input = scanner.nextLine();
        }
    }
}