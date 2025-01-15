package shuhuai.leetcode.problems.t100.t169;

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
            System.out.println(new Solution().majorityElementMap(nums));
            System.out.println(new Solution().majorityElementRandom(nums));
            System.out.println(new Solution().majorityElementRecursive(nums));
            System.out.println(new Solution().majorityElementClever(nums));
            System.out.println(new Solution().majorityElementSort(nums));
            input = scanner.nextLine();
        }
    }
}
