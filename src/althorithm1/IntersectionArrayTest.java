package althorithm1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionArrayTest {
    IntersectionArray test = new IntersectionArray();
    int[] arr1 = {1, 2, 2, 1};
    int[] arr2 = {2, 2};
    int[] res = {2, 2};
    @Test
    void intersection() {
        assertArrayEquals(test.intersection(arr1, arr2), res);
    }
}