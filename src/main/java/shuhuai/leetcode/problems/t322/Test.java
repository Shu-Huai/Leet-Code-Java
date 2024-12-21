package shuhuai.leetcode.problems.t322;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int[] coins = new Inputer().stringToIntArray(input);
            input = sc.nextLine();
            int amount = Integer.parseInt(input);
            System.out.println(new Solution().coinChange(coins, amount));
            input = sc.nextLine();
        }
    }
}