package shuhuai.leetcode.problems.t1;

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
            int target = sc.nextInt();
            int[] result = new Solution().twoSumSimple(nums, target);
            new Printer<Integer>().printArray(Arrays.stream(result).boxed().toArray(Integer[]::new), 0, 2);
            result = new Solution().twoSumHashMap(nums, target);
            new Printer<Integer>().printArray(Arrays.stream(result).boxed().toArray(Integer[]::new), 0, 2);
            input = sc.nextLine();
        }
    }
}