package shuhuai.leetcode.problems.t45;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int[] nums = new Inputer().stringToIntArray(input);
            System.out.println(new Solution().jumpGreedy(nums));
            System.out.println(new Solution().jumpClever(nums));
            input = sc.nextLine();
        }
    }
}