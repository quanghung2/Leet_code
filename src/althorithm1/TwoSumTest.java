package althorithm1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
class TwoSumTest {
    TwoSum sum = new TwoSum();
    int[] nums = {2,7,11,15};
    int[] target = {0, 1};
    @Test
    void twoSum() {
        assertArrayEquals(sum.twoSum(nums, 9), target);
    }
}