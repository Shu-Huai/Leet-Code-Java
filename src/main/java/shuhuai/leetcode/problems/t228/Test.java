package shuhuai.leetcode.problems.t228;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] arr = input.split(" ");
            int[] nums = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                nums[i] = Integer.parseInt(arr[i]);
            }
            System.out.println(new Solution().summaryRanges(nums));
            input = sc.nextLine();
        }
    }
}