package shuhuai.leetcode.problems.t300.t383;

import java.util.Scanner;

public class Test {
    public void test() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!s.isEmpty()) {
            String[] arr = s.split(" ");
            System.out.println(new Solution().canConstruct(arr[0], arr[1]));
            s = sc.nextLine();
        }
    }
}
