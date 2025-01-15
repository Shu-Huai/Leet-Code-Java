package shuhuai.leetcode.problems.t400.t461;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] str = input.split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            System.out.println(new Solution().hammingDistance(x, y));
            input = sc.nextLine();
        }
    }
}