package br.com.jdp.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockIITest {

    @Test
    public void case1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertThat(new BestTimeToBuyAndSellStockII().maxProfit(prices)).isEqualTo(7);
    }

    @Test
    public void case2() {
        int[] prices = {1, 2, 3, 4, 5};
        assertThat(new BestTimeToBuyAndSellStockII().maxProfit(prices)).isEqualTo(4);
    }

    @Test
    public void case3() {
        int[] prices = {7, 6, 4, 3, 1};
        assertThat(new BestTimeToBuyAndSellStockII().maxProfit(prices)).isEqualTo(0);
    }

}