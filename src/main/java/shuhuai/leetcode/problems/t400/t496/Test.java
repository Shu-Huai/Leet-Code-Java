package shuhuai.leetcode.problems.t400.t496;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            int[] nums1 = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                nums1[i] = Integer.parseInt(split[i]);
            }
            split = sc.nextLine().split(" ");
            int[] nums2 = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                nums2[i] = Integer.parseInt(split[i]);
            }
            System.out.println(Arrays.toString(new Solution().nextGreaterElement(nums1, nums2)));
            System.out.println(Arrays.toString(new Solution().nextGreaterElementClever(nums1, nums2)));
            input = sc.nextLine();
        }
    }
}