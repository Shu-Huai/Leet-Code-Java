package shuhuai.leetcode.problems.t0.t56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            List<int[]> list = new ArrayList<>();
            while (!input.isEmpty()) {
                String[] split = input.split(" ");
                int[] arr = new int[split.length];
                for (int i = 0; i < split.length; i++) {
                    arr[i] = Integer.parseInt(split[i]);
                }
                list.add(arr);
                input = scanner.nextLine();
            }
            int[][] intervals = new int[list.size()][list.getFirst().length];
            for (int i = 0; i < list.size(); i++) {
                System.arraycopy(list.get(i), 0, intervals[i], 0, list.get(i).length);
            }
            int[][] result = new Solution().merge(intervals);
            for (int[] arr : result) {
                System.out.println(Arrays.toString(arr));
            }
            input = scanner.nextLine();
        }
    }
}