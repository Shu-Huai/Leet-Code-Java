package shuhuai.leetcode.problems.t900.t933;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            input = sc.nextLine();
            String[] times = input.split(" ");
            int[] timesInt = new int[times.length];
            for (int i = 0; i < times.length; i++) {
                timesInt[i] = Integer.parseInt(times[i]);
            }
            RecentCounter rc = null;
            int count = 0;
            for (String string : split) {
                if (string.equals("RecentCounter")) {
                    rc = new RecentCounter();
                    System.out.print("null ");
                } else if (string.equals("ping")) {
                    if (rc != null) {
                        System.out.print(rc.ping(timesInt[count++]) + " ");
                    }
                }
            }
            System.out.println();
            input = sc.nextLine();
        }
    }
}