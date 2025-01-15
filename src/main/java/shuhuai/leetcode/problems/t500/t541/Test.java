package shuhuai.leetcode.problems.t500.t541;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            System.out.println(new Solution().reverseStr(split[0], Integer.parseInt(split[1])));
            input = sc.nextLine();
        }
    }
}