package shuhuai.leetcode.problems.t100.t162;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int[] nums = new Inputer().stringToIntArray(input);
            System.out.println(new Solution().findPeakElement(nums));
            input = scanner.nextLine();
        }
    }
}