package shuhuai.leetcode.problems.t0.t28;

public class Solution {
    public int strStrGenius(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStrSimple(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
                if (i + j == haystack.length() - 1) {
                    return -1;
                }
            }
        }
        return -1;
    }

    public int strStrKmp(String haystack, String needle) {
        int[] p = new int[needle.length()];
        int i = 0;
        int j = 1;
        while (j < needle.length()) {
            if (needle.charAt(i) == needle.charAt(j)) {
                p[j] = i + 1;
                i++;
                j++;
            } else if (i == 0) {
                p[j] = 0;
                j++;
            } else {
                i = p[i - 1];
            }
        }
        i = 0;
        j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else if (j == 0) {
                i++;
            } else {
                j = p[j - 1];
            }
        }
        return j == needle.length() ? i - j : -1;
    }
}