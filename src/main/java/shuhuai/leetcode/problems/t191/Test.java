package shuhuai.leetcode.problems.t191;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int n = Integer.parseUnsignedInt(input);
            System.out.println(new Solution().hammingWeight(n));
            input = sc.nextLine();
        }
    }
}