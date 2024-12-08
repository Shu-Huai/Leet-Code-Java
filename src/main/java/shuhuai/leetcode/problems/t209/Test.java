package shuhuai.leetcode.problems.t209;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int[] nums = new Inputer().stringToIntArray(input);
            int target = Integer.parseInt(scanner.nextLine());
            System.out.println(new Solution().minSubArrayLen(target, nums));
            System.out.println(new Solution().minSubArrayLenBinary(target, nums));
            input = scanner.nextLine();
        }
    }
}