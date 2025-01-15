package shuhuai.leetcode.problems.t100.t189;

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
            int k = Integer.parseInt(scanner.nextLine());
            System.arraycopy(nums, 0, nums, 0, nums.length);
            new Solution().rotateStupid(nums, k);
            new Printer<Integer>().printArray(Arrays.stream(nums).boxed().toArray(Integer[]::new));
            nums = new Inputer().stringToIntArray(input);
            new Solution().rotateReverse(nums, k);
            new Printer<Integer>().printArray(Arrays.stream(nums).boxed().toArray(Integer[]::new));
            nums = new Inputer().stringToIntArray(input);
            new Solution().rotateClever(nums, k);
            new Printer<Integer>().printArray(Arrays.stream(nums).boxed().toArray(Integer[]::new));
            input = scanner.nextLine();
        }
    }
}