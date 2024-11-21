package shuhuai.leetcode.problems.t120;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            List<List<Integer>> list = new ArrayList<>();
            while (!input.isEmpty()) {
                String[] split = input.split(" ");
                List<Integer> arr = new ArrayList<>();
                for (String s : split) {
                    arr.add(Integer.parseInt(s));
                }
                list.add(arr);
                input = sc.nextLine();
            }
            System.out.println(new Solution().minimumTotal(list));
            System.out.println(new Solution().minumumTotalClever(list));
            System.out.println(new Solution().minumumTotalSuperClever(list));
            input = sc.nextLine();
        }
    }
}