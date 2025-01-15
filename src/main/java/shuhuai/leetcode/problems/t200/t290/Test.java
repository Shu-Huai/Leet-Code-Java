package shuhuai.leetcode.problems.t200.t290;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String s = sc.nextLine();
            System.out.println(new Solution().wordPattern(input, s));
            input = sc.nextLine();
        }
    }
}