package shuhuai.leetcode.problems.t202;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            System.out.println(new Solution().isHappySet(Integer.parseInt(input)));
            System.out.println(new Solution().isHappyLink(Integer.parseInt(input)));
            System.out.println(new Solution().isHappyMath(Integer.parseInt(input)));
            input = sc.nextLine();
        }
    }
}