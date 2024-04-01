package shuhuai.leetcode.problems.t389;

public class Solution {
    public char findTheDifference(String s, String t) {
        char[] sLetters = s.toCharArray();
        char[] tLetters = t.toCharArray();
        int count = 0;
        for (char elem : tLetters) {
            count += elem - 'a';
        }
        for (char elem : sLetters) {
            count -= elem - 'a';
        }
        return (char) (count + 'a');
    }
}