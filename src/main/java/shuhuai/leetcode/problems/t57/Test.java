package shuhuai.leetcode.problems.t57;

import shuhuai.leetcode.utils.Inputer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            List<int[]> list = new ArrayList<>();
            while (!input.isEmpty()) {
                list.add(new Inputer().stringToIntArray(input));
                input = sc.nextLine();
            }
            int[][] board = new int[list.size()][list.getFirst().length];
            for (int i = 0; i < list.size(); i++) {
                board[i] = new int[list.getFirst().length];
                System.arraycopy(list.get(i), 0, board[i], 0, list.getFirst().length);
            }
            input = sc.nextLine();
            int[] newInterval = new Inputer().stringToIntArray(input);
            System.out.println(Arrays.deepToString(new Solution().insert(board, newInterval)));
            input = sc.nextLine();
        }
    }
}