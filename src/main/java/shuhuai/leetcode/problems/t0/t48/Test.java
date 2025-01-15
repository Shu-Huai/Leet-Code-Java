package shuhuai.leetcode.problems.t0.t48;

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
            int[][] board = new int[list.size()][list.getFirst().length];
            for (int i = 0; i < list.size(); i++) {
                board[i] = new int[list.getFirst().length];
                System.arraycopy(list.get(i), 0, board[i], 0, list.getFirst().length);
            }
            new Solution().rotate(board);
            for (int[] ints : board) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
            input = scanner.nextLine();
        }
    }
}