package shuhuai.leetcode.problems.t100.t190;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int n = Integer.parseUnsignedInt(input, 2);
            System.out.println(new Solution().reverseBitsSimple(n));
            System.out.println(new Solution().reverseBitsClever(n));
            input = sc.nextLine();
        }
    }
}