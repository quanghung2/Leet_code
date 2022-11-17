package quan;

public class SumOfAllOddLengthSubarray {
    // Could you solve this problem in O(n) time complexity?
    public static int summ(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            int left = i + 1;
            int right = arr.length - i;
            int num_of_subarray = left * right;
            int num_of_odd_length_subarray = num_of_subarray %2 == 0 ? num_of_subarray/2 : num_of_subarray/2 + 1;
            sum += num_of_odd_length_subarray * arr[i];
        }
        return sum;
    }

    public static int main(String[] args) {
        int[] arr = new int[]{1,4,2,5,3};
        return summ(arr);
    }
}
