package althorithm1;

public class SearchInsert {
    public int searchInsert(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(numbers[mid] == target) {
                return mid;
            } else if(numbers[mid] < target) {
                start = mid +1;

            } else {
                end = mid -1;
            }
        }
        return start;
    }
}
