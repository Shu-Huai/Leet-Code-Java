package shuhuai.leetcode.problems.t200.t238;

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
            new Printer<Integer>().printArray(Arrays.stream(new Solution().productExceptSelf(nums)).boxed().toArray(Integer[]::new));
            new Printer<Integer>().printArray(Arrays.stream(new Solution().productExceptSelfClever(nums)).boxed().toArray(Integer[]::new));
            new Printer<Integer>().printArray(Arrays.stream(new Solution().productExceptSelfDivide(nums)).boxed().toArray(Integer[]::new));
            input = scanner.nextLine();
        }
    }
}