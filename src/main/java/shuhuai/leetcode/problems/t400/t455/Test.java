package shuhuai.leetcode.problems.t400.t455;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            int[] g = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                g[i] = Integer.parseInt(split[i]);
            }
            input = sc.nextLine();
            split = input.split(" ");
            int[] s = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                s[i] = Integer.parseInt(split[i]);
            }
            System.out.println(new Solution().findContentChildren(g, s));
            input = sc.nextLine();
        }
    }
}