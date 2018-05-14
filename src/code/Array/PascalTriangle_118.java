package code.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle_118 {

    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0) {
            return result;
        }
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);

        Integer[] last = new Integer[numRows];
        last[0] = 1;
        Integer[] now = new Integer[numRows];
        for (int i = 1; i < numRows; i++) {
            now[0] = 1;
            now[i] = 1;
            for (int j = 1; j <= i / 2; j++) {
                now[j] = last[j - 1] + last[j];
                now[i - j] = now[j];
            }
            System.arraycopy(now, 0, last, 0, i + 1);
            Integer[] list = new Integer[i + 1];
            System.arraycopy(now, 0, list, 0, i + 1);
            result.add(Arrays.asList(list));
        }

        return result;
    }
}
