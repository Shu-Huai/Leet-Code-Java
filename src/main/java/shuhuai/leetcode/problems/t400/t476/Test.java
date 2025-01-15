package shuhuai.leetcode.problems.t400.t476;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().findComplement(Integer.parseInt(input)));
            input = sc.nextLine();
        }
    }
}