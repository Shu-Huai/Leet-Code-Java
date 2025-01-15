package shuhuai.leetcode.problems.t300.t300;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int[] nums = new Inputer().stringToIntArray(input);
            System.out.println(new Solution().lengthOfLISDp(nums));
            System.out.println(new Solution().lengthOfLISGreedy(nums));
            input = scanner.nextLine();
        }
    }
}