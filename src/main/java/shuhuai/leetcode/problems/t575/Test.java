package shuhuai.leetcode.problems.t575;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            int[] candyTypes = new int[split.length];
            for (int i = 0; i < candyTypes.length; i++) {
                candyTypes[i] = Integer.parseInt(split[i]);
            }
            System.out.println(new Solution().distributeCandies(candyTypes));
            input = sc.nextLine();
        }
    }
}