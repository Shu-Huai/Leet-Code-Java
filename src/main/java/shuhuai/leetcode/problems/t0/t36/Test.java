package shuhuai.leetcode.problems.t0.t36;

import shuhuai.leetcode.utils.Inputer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            List<char[]> list = new ArrayList<>();
            while (!input.isEmpty()) {
                list.add(new Inputer().stringToCharArray(input));
                input = sc.nextLine();
            }
            char[][] board = new char[list.size()][list.getFirst().length];
            for (int i = 0; i < list.size(); i++) {
                board[i] = new char[list.getFirst().length];
                System.arraycopy(list.get(i), 0, board[i], 0, list.getFirst().length);
            }
            System.out.println(new Solution().isValidSudoku(board));
            System.out.println(new Solution().isValidSudokuClever(board));
            input = sc.nextLine();
        }
    }
}