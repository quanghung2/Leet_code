package althorithm1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] res = new int[list.size()];
        for(int k =0; k < list.size(); k++) {
            res[k] = list.get(k);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        for(int i: intersection(nums1, nums2)) {
            System.out.println(i);
        }
    }
}
