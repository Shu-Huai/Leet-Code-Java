package shuhuai.leetcode.problems.t600.t605;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            String[] split = input.split(" ");
            int[] flowerbed = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                flowerbed[i] = Integer.parseInt(split[i]);
            }
            int n = sc.nextInt();
            System.out.println(new Solution().canPlaceFlowers(flowerbed, n));
            sc.nextLine();
            input = sc.nextLine();
        }
    }
}