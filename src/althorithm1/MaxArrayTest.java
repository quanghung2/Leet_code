package althorithm1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxArrayTest {
    MaxArray m = new MaxArray();
    int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
    int[] nums2 = {5,4,-1,7,8};
    @Test
    void maxSubArray() {
        assertEquals(m.maxSubArray(nums1), 6);
        assertEquals(m.maxSubArray(nums2), 23);
    }
}