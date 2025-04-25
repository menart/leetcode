package T0056MergeIntervals;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        printArray(merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
        printArray(merge(new int[][]{{1, 4}, {4, 5}}));
        printArray(merge(new int[][]{{1, 4}, {0, 4}}));
        printArray(merge(new int[][]{{1, 4}, {0, 0}}));
    }

    private static void printArray(int[][] arr) {
        for (int[] num : arr) {
            System.out.print(Arrays.toString(num) + ",");
        }
        System.out.println();
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int first = intervals[0][0];
        int second = intervals[0][1];
        LinkedList<int[]> result = new LinkedList<>();
        for (int[] num : intervals) {
            if (first > num[0]) {
                first = num[0];
            }
            if (second < num[0]) {
                result.add(new int[]{first,second});
                first = num[0];

            }
            second = Math.max(num[1], second);

        }
        result.add(new int[]{first,second});
        return result.toArray(new int[result.size()][]);
    }
}


