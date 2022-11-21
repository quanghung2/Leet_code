package quan;

import java.util.*;

public class IntersectionOfTwoArray {
    //Todo: write lambda expression :))
    public static int[] intersect(int[] num1, int[] num2){

        Set<Integer> set1 = new HashSet<>();
        Arrays.stream(num1).forEach(set1::add);

        Set<Integer> set2 = new HashSet<>();
        Arrays.stream(num2).forEach(set2::add);

        List<Integer> result = new ArrayList<>();
        // understand
        set1.forEach(e -> {
            if(set2.contains(e)){
                result.add(e);
            }
        });
        // return kho the
        return  result.stream().mapToInt(Integer::intValue).toArray();
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
