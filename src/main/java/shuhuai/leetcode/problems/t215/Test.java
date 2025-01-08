package shuhuai.leetcode.problems.t215;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int[] nums = new Inputer().stringToIntArray(input);
            int k = Integer.parseInt(scanner.nextLine());
            Solution solution = new Solution();
            System.out.println(solution.findKthLargestHeap(nums, k));
            System.out.println(solution.findKthLargestSort(nums, k));
            input = scanner.nextLine();
        }
    }
}