package althorithm1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class SearchInsertTest {

    private SearchInsert searchInsert = new SearchInsert();
    int[] numbers = {1,3,5,6};
    int[] nums = {1,3,5,7,8,9,10,15};
    @Test
    void searchInsert() {
        assertEquals(searchInsert.searchInsert(numbers, 5), 2);
        assertEquals(searchInsert.searchInsert(nums, 12), 7);
    }
}