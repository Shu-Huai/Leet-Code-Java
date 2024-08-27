package shuhuai.leetcode.problems.t661;

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
                String[] split = input.split(" ");
                int[] arr = new int[split.length];
                for (int i = 0; i < split.length; i++) {
                    arr[i] = Integer.parseInt(split[i]);
                }
                list.add(arr);
                input = sc.nextLine();
            }
            int[][] img = new int[list.size()][list.getFirst().length];
            for (int i = 0; i < list.size(); i++) {
                System.arraycopy(list.get(i), 0, img[i], 0, list.get(i).length);
            }
            System.out.println(Arrays.deepToString(new Solution().imageSmoother(img)));
            input = sc.nextLine();
        }
    }
}