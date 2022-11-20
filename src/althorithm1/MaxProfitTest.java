package althorithm1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class MaxProfitTest {
    int[] nums = {7,1,5,3,6,4};
    MaxProfit max = new MaxProfit();
    @Test
    void maxProfit() {
        assertEquals(max.maxProfit(nums), 5);
    }
}