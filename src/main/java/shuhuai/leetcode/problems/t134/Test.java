package shuhuai.leetcode.problems.t134;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int[] gas = new Inputer().stringToIntArray(input);
            input = scanner.nextLine();
            int[] cost = new Inputer().stringToIntArray(input);
            System.out.println(new Solution().canCompleteCircuit(gas, cost));
            input = scanner.nextLine();
        }
    }
}