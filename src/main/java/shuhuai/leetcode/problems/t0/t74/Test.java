package shuhuai.leetcode.problems.t0.t74;

import shuhuai.leetcode.utils.Inputer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            List<int[]> matrix = new ArrayList<>();
            while (!input.isEmpty()) {
                int[] nums = new Inputer().stringToIntArray(input);
                matrix.add(nums);
                input = scanner.nextLine();
            }
            int[][] matrixArray = new int[matrix.size()][matrix.getFirst().length];
            for (int i = 0; i < matrix.size(); i++) {
                matrixArray[i] = matrix.get(i);
            }
            int target = Integer.parseInt(scanner.nextLine());
            System.out.println(new Solution().searchMatrix(matrixArray, target));
            System.out.println(new Solution().searchMatrixBinary(matrixArray, target));
            input = scanner.nextLine();
        }
    }
}