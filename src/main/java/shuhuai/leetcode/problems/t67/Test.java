package shuhuai.leetcode.problems.t67;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            System.out.println(new Solution().addBinary(split[0], split[1]));
            input = sc.nextLine();
        }
    }
}