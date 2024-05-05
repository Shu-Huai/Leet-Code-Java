package shuhuai.leetcode.problems.t566;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            List<int[]> list = new ArrayList<>();
            while (!input.isEmpty()) {
                String[] split = input.split(" ");
                int[] nums = new int[split.length];
                for (int i = 0; i < split.length; i++) {
                    nums[i] = Integer.parseInt(split[i]);
                }
                list.add(nums);
                input = sc.nextLine();
            }
            int[][] mat = new int[list.size()][list.getFirst().length];
            for (int i = 0; i < list.size(); i++) {
                System.arraycopy(list.get(i), 0, mat[i], 0, list.get(i).length);
            }
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] result = new Solution().matrixReshape(mat, r, c);
            for (int[] ints : result) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
            sc.nextLine();
            input = sc.nextLine();
        }
    }
}