package shuhuai.leetcode.problems.t219;

import shuhuai.leetcode.utils.Inputer;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int[] nums = new Inputer().stringToIntArray(input);
            int k = sc.nextInt();
            Solution solution = new Solution();
            System.out.println(solution.containsNearbyDuplicateSimple(nums, k));
            System.out.println(solution.containsNearbyDuplicateClever(nums, k));
            sc.nextLine();
            input = sc.nextLine();
        }
    }
}