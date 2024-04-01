package shuhuai.leetcode.problems.t121;

public class Solution {
    public int maxProfitSimple(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int cur = prices[j] - prices[i];
                if (cur > max) {
                    max = cur;
                }
            }
        }
        return max;
    }

    public int maxProfitClever(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
