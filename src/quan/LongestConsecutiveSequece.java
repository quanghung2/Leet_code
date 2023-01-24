package quan;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutiveSequece {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        System.out.println(longest(arr));
    }

    public static int longest(int[] nums){
        Arrays.sort(nums);

        int answer = 0, count = 1;

        ArrayList<Integer> array = new ArrayList<>();
        array.add(nums[0]);

        // store distinct number
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                array.add(nums[i]);
            }
        }

        // check consecutive order of array
        for (int i = 1; i < array.size(); i++){
            if (array.get(i) == array.get(i-1) + 1){
                count++;
            } else {
                count = 1;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }
}
