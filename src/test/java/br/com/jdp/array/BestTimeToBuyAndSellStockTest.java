package br.com.jdp.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockTest {

    @Test
    public void case1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertThat(new BestTimeToBuyAndSellStock().maxProfit(prices)).isEqualTo(7);
    }

    @Test
    public void case2() {
        int[] prices = {1, 2, 3, 4, 5};
        assertThat(new BestTimeToBuyAndSellStock().maxProfit(prices)).isEqualTo(4);
    }

    @Test
    public void case3() {
        int[] prices = {7, 6, 4, 3, 1};
        assertThat(new BestTimeToBuyAndSellStock().maxProfit(prices)).isEqualTo(0);
    }

    @Test
    public void case1_2() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertThat(new BestTimeToBuyAndSellStock().maxProfit2(prices)).isEqualTo(7);
    }

    @Test
    public void case2_2() {
        int[] prices = {1, 2, 3, 4, 5};
        assertThat(new BestTimeToBuyAndSellStock().maxProfit2(prices)).isEqualTo(4);
    }

    @Test
    public void case3_2() {
        int[] prices = {7, 6, 4, 3, 1};
        assertThat(new BestTimeToBuyAndSellStock().maxProfit2(prices)).isEqualTo(0);
    }

}