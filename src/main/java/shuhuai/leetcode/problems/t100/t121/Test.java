package shuhuai.leetcode.problems.t100.t121;

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
            System.out.println(new Solution().maxProfitSimple(nums));
            System.out.println(new Solution().maxProfitClever(nums));
            input = scanner.nextLine();
        }
    }
}
