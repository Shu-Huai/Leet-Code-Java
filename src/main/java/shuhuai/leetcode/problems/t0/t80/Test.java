package shuhuai.leetcode.problems.t0.t80;

import shuhuai.leetcode.utils.Inputer;
import shuhuai.leetcode.utils.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int[] nums = new Inputer().stringToIntArray(input);
            System.out.println(new Solution().removeDuplicates(nums));
            new Printer<Integer>().printArray(Arrays.stream(nums).boxed().toArray(Integer[]::new));
            input = sc.nextLine();
        }
    }
}