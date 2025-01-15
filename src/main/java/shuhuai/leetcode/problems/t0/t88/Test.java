package shuhuai.leetcode.problems.t0.t88;


import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            int m = Integer.parseInt(input);
            int n = scanner.nextInt();
            int[] nums1 = new int[m + n];
            int[] nums2 = new int[n];
            for (int i = 0; i < m; i++) {
                nums1[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                nums2[i] = scanner.nextInt();
            }
            new Solution().merge(nums1, m, nums2, n);
            for (int i = 0; i < m + n; i++) {
                System.out.print(nums1[i]);
                System.out.print(" ");
            }
            System.out.println();
            scanner.nextLine();
            input = scanner.nextLine();
        }
    }
}
