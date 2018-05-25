package code.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII_119 {

    public static void main(String[] args) {
        getRow(0);
    }

    public static List<Integer> getRow(int rowIndex) {

        if (rowIndex == 0) {
            List<Integer> result = new ArrayList<>();
            result.add(1);
            return result;
        }
        Integer[] last = new Integer[rowIndex + 1];
        last[0] = 1;
        Integer[] now = new Integer[rowIndex + 1];
        for (int i = 1; i <= rowIndex; i++) {
            now[0] = 1;
            now[i] = 1;
            for (int j = 1; j <= i / 2; j++) {
                now[j] = last[j - 1] + last[j];
                now[i - j] = now[j];
            }
            System.arraycopy(now, 0, last, 0, i + 1);
        }

        return Arrays.asList(now);
    }
}
