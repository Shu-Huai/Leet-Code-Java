package shuhuai.leetcode.problems.t463;

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
                int[] arr = new int[split.length];
                for (int i = 0; i < split.length; i++) {
                    arr[i] = Integer.parseInt(split[i]);
                }
                list.add(arr);
                input = sc.nextLine();
            }
            int[][] grid = new int[list.size()][list.getFirst().length];
            for (int i = 0; i < list.size(); i++) {
                System.arraycopy(list.get(i), 0, grid[i], 0, list.get(i).length);
            }
            System.out.println(new Solution().islandPerimeter(grid));
            input = sc.nextLine();
        }
    }
}