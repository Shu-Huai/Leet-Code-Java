package shuhuai.leetcode.problems.t0.t66;

import shuhuai.leetcode.utils.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            int[] digits = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                digits[i] = Integer.parseInt(split[i]);
            }
            int[] result = new Solution().plusOne(digits);
            new Printer<>().printArray(Arrays.stream(result).boxed().toArray(Integer[]::new));
            input = sc.nextLine();
        }
    }
}