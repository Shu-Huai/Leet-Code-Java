package shuhuai.leetcode.problems.t482;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            System.out.println(new Solution().licenseKeyFormatting(split[0], Integer.parseInt(split[1])));
            input = sc.nextLine();
        }
    }
}