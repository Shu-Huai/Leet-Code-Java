package shuhuai.leetcode.problems.t0.t12;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int num = Integer.parseInt(input);
            System.out.println(new Solution().intToRoman(num));
            System.out.println(new Solution().intToRomanClever(num));
            input = sc.nextLine();
        }
    }
}
