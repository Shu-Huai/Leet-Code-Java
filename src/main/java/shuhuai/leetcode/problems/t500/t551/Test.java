package shuhuai.leetcode.problems.t500.t551;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().checkRecord(input));
            input = sc.nextLine();
        }
    }
}