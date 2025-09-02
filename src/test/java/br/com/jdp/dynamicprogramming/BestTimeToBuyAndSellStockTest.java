package br.com.jdp.dynamicprogramming;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

    @Test
    public void case1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        Assertions.assertThat(BestTimeToBuyAndSellStock.maxProfit(prices)).isEqualTo(5);
    }

    @Test
    public void case2() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        Assertions.assertThat(BestTimeToBuyAndSellStock.maxProfit(prices)).isEqualTo(0);
    }

}