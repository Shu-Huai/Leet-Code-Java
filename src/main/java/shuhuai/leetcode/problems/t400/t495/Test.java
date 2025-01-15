package shuhuai.leetcode.problems.t400.t495;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            int[] timeSeries = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                timeSeries[i] = Integer.parseInt(split[i]);
            }
            int duration = sc.nextInt();
            System.out.println(new Solution().findPoisonedDuration(timeSeries, duration));
            sc.nextLine();
            input = sc.nextLine();
        }
    }
}