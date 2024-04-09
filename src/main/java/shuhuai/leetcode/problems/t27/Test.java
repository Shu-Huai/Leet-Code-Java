package shuhuai.leetcode.problems.t27;

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
            int val = scanner.nextInt();
            int j = new Solution().removeElement(nums, val);
            System.out.println(j);
            new Printer<Integer>().printArray(Arrays.stream(nums).boxed().toArray(Integer[]::new), 0, j);
            scanner.nextLine();
            input = scanner.nextLine();
        }
    }
}