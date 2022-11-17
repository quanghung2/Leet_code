package quan;
import java.util.Arrays;

public class MoveZeroes {
    /**
     *
     * @param nums
     * not return (Void functions are stand-alone statements)
     */
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
    // expected result: 1 3 9 12 0 0 0
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,0};
        for (int a: moveZeroes(arr)){
            System.out.println(a);
        }
        //Todo: Write lambda expression
        Arrays.stream(moveZeroes(arr)).forEach(a-> System.out.println(a));
    }
}
