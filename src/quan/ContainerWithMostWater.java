package quan;

import java.util.HashMap;
import java.util.Map;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int hei[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(calculateMax(hei));
    }

    // O(n)
    public static int calculateMax(int[] height){
        int start = 0, end = height.length - 1, area = 0, max = 0;
        while (start < end){
            area = (end-start)*Math.min(height[start], height[end]);
            max = Math.max(area, max);
            if(height[start] < height[end]){
                start++;
            } else {
                end--;
            }
        }
        return max;
    }

    //O(n2)
    public static int maxArea (int[] height){
        int area = 0, max = 0;
        int n = height.length;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                area = (j-i)*Math.min(height[i], height[j]);
                max = Math.max(area, max);
            }
        }
        return max;
    }
}
