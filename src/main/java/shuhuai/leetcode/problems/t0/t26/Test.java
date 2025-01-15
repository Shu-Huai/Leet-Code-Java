package shuhuai.leetcode.problems.t0.t26;

import shuhuai.leetcode.utils.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String[] arr = input.split(" ");
            int[] nums = new int[arr.length];
            for (int j = 0; j < nums.length; j++) {
                nums[j] = Integer.parseInt(arr[j]);
            }
            int j = new Solution().removeDuplicates(nums);
            System.out.println(j);
            new Printer<Integer>().printArray(Arrays.stream(nums).boxed().toArray(Integer[]::new), 0, j);
            scanner.nextLine();
            input = scanner.nextLine();
        }
    }
}
