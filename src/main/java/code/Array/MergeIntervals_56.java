package code.Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals_56 {

    public static void main(String[] args) {
//        [1,3],[2,6],[8,10],[15,18]
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(4, 5));
//        intervals.add(new Interval(8, 10));
//        intervals.add(new Interval(15, 18));
        List<Interval> result = new MergeIntervals_56().merge(intervals);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public List<Interval> merge(List<Interval> intervals) {

        List<Interval> result = new ArrayList<>();

        int n = intervals.size();
        if (n == 0) {
            return result;
        }

        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        int start = intervals.get(0).start;
        int last = intervals.get(0).end;
        for (int i = 1; i < n; i++) {
            Interval temp = intervals.get(i);
            if (temp.start <= last) {
                last = temp.end > last ? temp.end : last;
            } else {
                result.add(new Interval(start, last));
                start = temp.start;
                last = temp.end;
            }
        }
        result.add(new Interval(start, last));
        return result;

    }

    static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}
