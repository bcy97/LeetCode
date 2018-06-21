package code.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII_40 {

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        ArrayList<Integer> choosed = new ArrayList<>();

        Arrays.sort(candidates);

        addCandidate(candidates, choosed, target, result, 0);

        return result;
    }

    public static void addCandidate(int[] candidates, ArrayList<Integer> choosed, int target, List<List<Integer>> result, int index) {

        ArrayList<Integer> temp = (ArrayList<Integer>) choosed.clone();
        for (int i = index; i < candidates.length; i++) {
            int newSum = sum(choosed) + candidates[i];
            temp.add(candidates[i]);
            if (newSum < target) {
                addCandidate(candidates, temp, target, result, i + 1);
            } else if (newSum == target) {
                if (!result.contains(temp)) {
                    result.add(new ArrayList<>(temp));
                }
            } else {
                return;
            }
            temp.remove(temp.size() - 1);
        }

    }

    public static int sum(ArrayList<Integer> choosed) {
        int sum = 0;
        for (int i = 0; i < choosed.size(); i++) {
            sum += choosed.get(i);
        }
        return sum;
    }
}
