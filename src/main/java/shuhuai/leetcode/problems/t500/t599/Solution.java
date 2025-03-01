package shuhuai.leetcode.problems.t500.t599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length && i <= min; i++) {
            if (map.containsKey(list2[i]) && i + map.get(list2[i]) <= min) {
                if (i + map.get(list2[i]) < min) {
                    list.clear();
                    min = i + map.get(list2[i]);
                }
                list.add(list2[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}