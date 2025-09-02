package br.com.jdp.dynamicprogramming;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // track lowest price so far
        int maxProfit = 0; // track max profit so far

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update min if we found a lower price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // check profit if sold today
            }
        }
        return maxProfit;
    }

}
