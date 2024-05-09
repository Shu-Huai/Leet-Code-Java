package shuhuai.leetcode.problems.t598;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            int m = Integer.parseInt(input);
            int n = sc.nextInt();
            sc.nextLine();
            input = sc.nextLine();
            List<int[]> list = new ArrayList<>();
            while (!input.isEmpty()) {
                int[] arr = new int[2];
                String[] str = input.split(" ");
                arr[0] = Integer.parseInt(str[0]);
                arr[1] = Integer.parseInt(str[1]);
                list.add(arr);
                input = sc.nextLine();
            }
            int[][] ops = new int[list.size()][2];
            for (int i = 0; i < list.size(); i++) {
                ops[i][0] = list.get(i)[0];
                ops[i][1] = list.get(i)[1];
            }
            System.out.println(new Solution().maxCount(m, n, ops));
            input = sc.nextLine();
        }
    }
}