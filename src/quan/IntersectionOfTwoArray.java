package quan;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static int[] intersect(int[] num1, int[] num2){
        int n = 0;
        if (num1.length > num2.length) {
            n = num1.length;
        } else {
            n = num2.length;
        }
        int[] nums = new int[n];
        int k = 0;

        Set<Integer> set1 = new HashSet<Integer>();
        Collections.addAll(set1, num1);

        Set<Integer> set2 = new HashSet<Integer>();
        Collections.addAll(set2, num2);
        for (Integer num: set1) {
            if (set2.contains(num)){
                nums[k] = num;
            } k++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] nums = intersect(num1, num2);
        for (int num : nums){
            System.out.println(num);
        }
    }
}
