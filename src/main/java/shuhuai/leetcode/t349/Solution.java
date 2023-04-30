package shuhuai.leetcode.t349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersectionSet(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        if (set1.size() > set2.size()) {
            Set<Integer> temp = set1;
            set1 = set2;
            set2 = temp;
        }
        Set<Integer> resultSet = new HashSet<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }
        return result;
    }

    public int[] intersectionSort(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[nums1.length + nums2.length];
        int index = 0;
        int index1 = 0;
        int index2 = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            int num1 = nums1[index1], num2 = nums2[index2];
            if (num1 == num2) {
                if (index == 0 || num1 != result[index - 1]) {
                    result[index++] = num1;
                }
                index1++;
                index2++;
            } else if (num1 < num2) {
                index1++;
            } else {
                index2++;
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}