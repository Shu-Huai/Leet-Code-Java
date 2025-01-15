package shuhuai.leetcode.problems.t0.t64;

import shuhuai.leetcode.utils.Inputer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            List<int[]> list = new ArrayList<>();
            while (!input.isEmpty()) {
                list.add(new Inputer().stringToIntArray(input));
                input = scanner.nextLine();
            }
            int[][] grid = new int[list.size()][list.getFirst().length];
            for (int i = 0; i < list.size(); i++) {
                grid[i] = new int[list.get(i).length];
                System.arraycopy(list.get(i), 0, grid[i], 0, list.get(i).length);
            }
            System.out.println(new Solution().minPathSum(grid));
            input = scanner.nextLine();
        }
    }
}