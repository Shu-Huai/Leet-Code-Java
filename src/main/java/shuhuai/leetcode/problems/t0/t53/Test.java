package shuhuai.leetcode.problems.t0.t53;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int[] nums = new Inputer().stringToIntArray(input);
            System.out.println(new Solution().maxSubArrayDp(nums));
            System.out.println(new Solution().maxSubArrayDpClever(nums));
            System.out.println(new Solution().maxSubArrayDivide(nums));
            input = scanner.nextLine();
        }
    }
}