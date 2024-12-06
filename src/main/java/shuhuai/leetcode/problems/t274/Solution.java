package shuhuai.leetcode.problems.t274;

import java.util.Arrays;

public class Solution {
    public int hIndexStupid(int[] citations) {
        int max = 0;
        for (int i = 1; i <= citations.length; i++) {
            int count = 0;
            for (int citation : citations) {
                if (citation >= i) {
                    count++;
                }
                if (count >= i) {
                    max = i;
                    break;
                }
            }
        }
        return max;
    }

    public int hIndexSort(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (h <= citations[i]) {
                return h;
            }
        }
        return 0;
    }

    public int hIndexCoutner(int[] citations) {
        int n = citations.length;
        int[] counter = new int[n + 1];
        for (int citation : citations) {
            if (citation >= n) {
                counter[n]++;
            } else {
                counter[citation]++;
            }
        }
        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += counter[i];
            if (total >= i) {
                return i;
            }
        }
        return 0;
    }

    public int hIndexBinary(int[] citations) {
        int left = 0;
        int right = citations.length;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            int count = 0;
            for (int citation : citations) {
                if (citation >= mid) {
                    count++;
                }
            }
            if (count >= mid) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}