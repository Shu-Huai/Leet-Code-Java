package shuhuai.leetcode.t345;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char item : "aeiouAEIOU".toCharArray()) {
            set.add(item);
        }
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < n && !set.contains(arr[i])) {
                ++i;
            }
            while (j > 0 && !set.contains(arr[j])) {
                --j;
            }
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                ++i;
                --j;
            }
        }
        return new String(arr);
    }
}