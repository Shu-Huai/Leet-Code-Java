package shuhuai.leetcode.problems.t100.t167;

import shuhuai.leetcode.utils.Inputer;
import shuhuai.leetcode.utils.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int[] nums = new Inputer().stringToIntArray(input);
            int target = Integer.parseInt(scanner.nextLine());
            int[] result = new Solution().twoSum(nums, target);
            new Printer<Integer>().printArray(Arrays.stream(result).boxed().toArray(Integer[]::new));
            result = new Solution().twoSumBinary(nums, target);
            new Printer<Integer>().printArray(Arrays.stream(result).boxed().toArray(Integer[]::new));
            result = new Solution().twoSumPointer(nums, target);
            new Printer<Integer>().printArray(Arrays.stream(result).boxed().toArray(Integer[]::new));
            input = scanner.nextLine();
        }
    }
}