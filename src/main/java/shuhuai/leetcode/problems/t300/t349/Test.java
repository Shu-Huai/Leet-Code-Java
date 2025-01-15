package shuhuai.leetcode.problems.t300.t349;

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
            Printer<Integer> printer = new Printer<>();
            printer.printArray(Arrays.stream(new Solution().intersectionSet(nums1, nums2)).boxed().toArray(Integer[]::new));
            printer.printArray(Arrays.stream(new Solution().intersectionSort(nums1, nums2)).boxed().toArray(Integer[]::new));
            input = sc.nextLine();
        }
    }
}