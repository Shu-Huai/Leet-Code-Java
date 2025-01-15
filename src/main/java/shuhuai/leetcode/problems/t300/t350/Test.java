package shuhuai.leetcode.problems.t300.t350;


import shuhuai.leetcode.utils.Printer;

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
            int[] result = new Solution().intersectLoop(nums1, nums2);
            new Printer<Integer>().printArray(Arrays.stream(result).boxed().toArray(Integer[]::new));
            result = new Solution().intersectMap(nums1, nums2);
            new Printer<Integer>().printArray(Arrays.stream(result).boxed().toArray(Integer[]::new));
            input = sc.nextLine();
        }
    }
}