package shuhuai.leetcode.utils;

public class Inputer {
    public int[] stringToIntArray(String input) {
        String[] str = input.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    public char[] stringToCharArray(String input) {
        String[] str = input.split(" ");
        char[] arr = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = str[i].charAt(0);
        }
        return arr;
    }
}