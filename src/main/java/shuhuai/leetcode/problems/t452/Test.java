package shuhuai.leetcode.problems.t452;

import shuhuai.leetcode.utils.Inputer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public void test(){
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();
        while (!input.isEmpty()){
            List<int[]> list = new ArrayList<>();
            while (!input.isEmpty()){
                list.add(new Inputer().stringToIntArray(input));
                input = sc.nextLine();
            }
            int[][] points = new int[list.size()][2];
            for (int i = 0; i < list.size(); i++) {
                points[i] = list.get(i);
            }
            System.out.println(new Solution().findMinArrowShots(points));
            input = sc.nextLine();
        }
    }
}