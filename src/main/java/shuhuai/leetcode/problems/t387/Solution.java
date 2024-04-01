package shuhuai.leetcode.problems.t387;

public class Solution {
    public int firstUniqChar(String s) {
        int[] counts = new int[26];
        char[] letters = s.toCharArray();
        for (char letter : letters) {
            counts[letter - 'a']++;
        }
        for (int i = 0; i < letters.length; i++) {
            if (counts[letters[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
