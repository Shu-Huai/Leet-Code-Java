package shuhuai.leetcode.problems.t746;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int[] cost = new Inputer().stringToIntArray(input);
            System.out.println(new Solution().minCostClimbingStairs(cost));
            input = sc.nextLine();
        }
    }
}