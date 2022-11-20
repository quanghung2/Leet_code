package quan;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> pre = new ArrayList<>();
        pre.add(1);

        result.add(pre);

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(pre.get(j) + pre.get(j - 1));
            }
            temp.add(1);
            pre = temp;
            result.add(pre);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(4));
    }
}

