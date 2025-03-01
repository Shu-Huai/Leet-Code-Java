package shuhuai.leetcode.problems.t600.t605;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i > 0 && flowerbed[i - 1] == 0 || i == 0)
                    && (i < flowerbed.length - 1 && flowerbed[i + 1] == 0 || i == flowerbed.length - 1)) {
                n--;
                if (n == 0) {
                    return true;
                }
                flowerbed[i] = 1;
            }
        }
        return false;
    }
}