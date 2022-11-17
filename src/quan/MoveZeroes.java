package quan;
import java.util.Arrays;

public class MoveZeroes {
    public static int[] moveZeroes(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int k = 0;
        int[] sorted_array = new int[n];
        for (int i = 0; i < n; i++){
            if(nums[i] != 0){
                sorted_array[k] = nums[i];
                k++;
            }
        }
        return sorted_array;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,12,0,9};
        moveZeroes(arr);
        for (int a: arr){
            System.out.println(a);
        }
    }
}
