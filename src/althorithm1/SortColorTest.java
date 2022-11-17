package althorithm1;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

class SortColorTest {

    private SortColor sortColor = new SortColor();
    private int[] result = {0, 0, 1, 1, 2, 3, 4};
    private int[] nums = {3, 2, 4, 0 ,1 ,0 , 1};
    @Test
    void sortColors() {
        assertArrayEquals(sortColor.sortColors(nums), result);
    }
}