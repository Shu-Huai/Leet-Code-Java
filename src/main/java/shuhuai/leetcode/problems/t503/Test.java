package shuhuai.leetcode.problems.t503;

import shuhuai.leetcode.utils.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String[] nums = input.split(" ");
            int[] numsInt = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                numsInt[i] = Integer.parseInt(nums[i]);
            }
            int[] result = new Solution().nextGreaterElementsStupid(numsInt);
            Printer<Integer> printer = new Printer<>();
            printer.printArray(Arrays.stream(result).boxed().toArray(Integer[]::new));
            result = new Solution().nextGreaterElementsMonotonicStack(numsInt);
            printer.printArray(Arrays.stream(result).boxed().toArray(Integer[]::new));
            input = scanner.nextLine();
        }
    }
}