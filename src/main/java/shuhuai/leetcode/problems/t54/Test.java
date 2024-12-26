package shuhuai.leetcode.problems.t54;


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
                String[] split = input.split(" ");
                int[] arr = new int[split.length];
                for (int i = 0; i < split.length; i++) {
                    arr[i] = Integer.parseInt(split[i]);
                }
                list.add(arr);
                input = scanner.nextLine();
            }
            int[][] board = new int[list.size()][list.getFirst().length];
            for (int i = 0; i < list.size(); i++) {
                System.arraycopy(list.get(i), 0, board[i], 0, list.get(i).length);
            }
            List<Integer> result = new Solution().spiralOrder(board);
            for (Integer integer : result) {
                System.out.print(integer + " ");
            }
            input = scanner.nextLine();
        }
    }
}