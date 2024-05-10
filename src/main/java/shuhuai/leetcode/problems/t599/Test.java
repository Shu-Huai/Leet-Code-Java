package shuhuai.leetcode.problems.t599;

import shuhuai.leetcode.utils.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.isEmpty()) {
            List<String> list1 = new ArrayList<>();
            while (!input.isEmpty()) {
                list1.add(input);
                input = sc.nextLine();
            }
            input = sc.nextLine();
            List<String> list2 = new ArrayList<>();
            while (!input.isEmpty()) {
                list2.add(input);
                input = sc.nextLine();
            }
            String[] result = new Solution().findRestaurant(list1.toArray(new String[0]), list2.toArray(new String[0]));
            new Printer<String>().printArray(result);
            input = sc.nextLine();
        }
    }
}