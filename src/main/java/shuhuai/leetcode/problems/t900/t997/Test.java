package shuhuai.leetcode.problems.t900.t997;

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
                list.add(new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1])});
                input = sc.nextLine();
            }
            input = sc.nextLine();
            int n = Integer.parseInt(input);
            int[][] trust = new int[list.size()][2];
            for (int i = 0; i < list.size(); i++) {
                int[] arr = list.get(i);
                trust[i][0] = arr[0];
                trust[i][1] = arr[1];
            }
            System.out.println(new Solution().findJudge(n, trust));
            input = sc.nextLine();
        }
    }
}