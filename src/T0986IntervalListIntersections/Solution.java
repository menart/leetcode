package T0986IntervalListIntersections;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(intervalIntersection(new int[][]{{0,2},{5,10},{13,23},{24,25}},
                new int[][]{{1,5},{8,12},{15,24},{25,26}}));
    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList.length == 0 || secondList.length == 0) return new int[][]{};
        int first = 0;
        int second = 0;
        List<int[]> result = new ArrayList<>();


        while (first < firstList.length && second < secondList.length) {
            int[] a = firstList[first];
            int[] b = secondList[second];

            // Находим пересечение текущих интервалов
            int start = Math.max(a[0], b[0]);
            int end = Math.min(a[1], b[1]);

            if (start <= end) {
                result.add(new int[]{start, end});
            }

            // Перемещаем указатель с меньшим значением конца интервала
            if (a[1] < b[1]) {
                first++;
            } else {
                second++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
