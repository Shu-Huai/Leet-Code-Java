package shuhuai.leetcode.problems.t700.t740;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int[] nums = new Inputer().stringToIntArray(input);
            System.out.println(new Solution().deleteAndEarn(nums));
            System.out.println(new Solution().deleteAndEarnClever(nums));
            input = scanner.nextLine();
        }
    }
}