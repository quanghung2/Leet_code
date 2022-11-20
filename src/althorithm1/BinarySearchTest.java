package althorithm1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class BinarySearchTest {

    private BinarySearch test = new BinarySearch();
    private BinarySearch2 test2 = new BinarySearch2();
    int[] numbers = {-1,0,3,5,9,12};
    int target = 9;
    int result = 4;
    @Test
    void search() {
        assertEquals(test.search(numbers, target), result);
    }

    @Test
    void search2() {
        assertEquals(test2.search2(numbers, target), result);
    }
}