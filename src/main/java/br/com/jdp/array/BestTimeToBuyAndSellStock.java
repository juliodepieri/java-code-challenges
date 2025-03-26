package br.com.jdp.array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/


public class BestTimeToBuyAndSellStock {

    // Solution 1
    // time complexity: O(N)
    // space complexity: O(1)
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        return totalProfit;
    }

    // Solution 2
    // time complexity: O(N)
    // space complexity: O(1)
    public int maxProfit2(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int maxProfitHere = 0;
        int maxProfitSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfitHere = Math.max(0, maxProfitSoFar + prices[i] - prices[i - 1]);
            maxProfitSoFar = Math.max(maxProfitSoFar, maxProfitHere);
        }

        return maxProfitSoFar;
    }

}
