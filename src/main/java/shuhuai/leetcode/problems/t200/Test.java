package shuhuai.leetcode.problems.t200;

import shuhuai.leetcode.utils.Inputer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            List<char[]> list = new ArrayList<>();
            while (!input.isEmpty()) {
                list.add(new Inputer().stringToCharArray(input));
                input = scanner.nextLine();
            }
            char[][] board = new char[list.size()][list.getFirst().length];
            for (int i = 0; i < list.size(); i++) {
                board[i] = new char[list.getFirst().length];
                System.arraycopy(list.get(i), 0, board[i], 0, list.getFirst().length);
            }
            System.out.println(new Solution().numIslands(board));
            input = scanner.nextLine();
        }
    }
}