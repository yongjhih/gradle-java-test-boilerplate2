package stock;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxProfitTest {

    @Test
    public void testMaxProfit() {
        assertThat(MaxProfit.maxProfit(Arrays.asList(1, 2, 3, 4, 5))).isEqualTo(4);
    }

    @Test
    public void testMaxProfit2() {
        assertThat(MaxProfit.maxProfit(Arrays.asList(5, 4, 3, 2, 1))).isEqualTo(0);
    }

    @Test
    public void testMaxProfitPre() {
        assertThat(MaxProfit.maxProfit(Arrays.asList(1, 5, 4, 3, 2, 1))).isEqualTo(4);
    }

    @Test
    public void testMaxProfitPost() {
        assertThat(MaxProfit.maxProfit(Arrays.asList(5, 4, 3, 2, 1, 5))).isEqualTo(4);
    }

    @Test
    public void testMaxProfitMidLow() {
        assertThat(MaxProfit.maxProfit(Arrays.asList(3, 2, 1, 2, 3))).isEqualTo(2);
    }

    @Test
    public void testMaxProfitMidLow2() {
        assertThat(MaxProfit.maxProfit(Arrays.asList(3, 2, 1, 1, 2, 3))).isEqualTo(2);
    }

    @Test
    public void testMaxProfitHighLowMid() {
        assertThat(MaxProfit.maxProfit(Arrays.asList(5, 3, 1, 2, 3, 2, 3, 4, 3, 2, 1))).isEqualTo(3);
    }

    //@Test
    public void testMaxProfitTwo() {
        assertThat(MaxProfit.maxProfit(Arrays.asList(1, 3))).isEqualTo(2);
    }

    //@Test
    public void testMaxProfitOne() {
        assertThat(MaxProfit.maxProfit(Arrays.asList(1))).isEqualTo(0);
    }
}
