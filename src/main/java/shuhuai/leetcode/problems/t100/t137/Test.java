package shuhuai.leetcode.problems.t100.t137;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int[] nums = new Inputer().stringToIntArray(input);
            System.out.println(new Solution().singleNumberMap(nums));
            System.out.println(new Solution().singleNumberBinary(nums));
            System.out.println(new Solution().singleNumberBinaryClever(nums));
            input = sc.nextLine();
        }
    }
}