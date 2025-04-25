package T1701AverageWaitingTime;

public class Solution {

    public static void main(String[] args) {
        System.out.println(averageWaitingTime(new int[][]{{1, 2}, {2, 5}, {4, 3}}));
        System.out.println(averageWaitingTime(new int[][]{{5, 2}, {5, 4}, {10, 3}, {20, 1}}));
    }

    public static double averageWaitingTime(int[][] customers) {
        long allTime = customers[0][1];
        long finishTime = customers[0][0] + customers[0][1];
        for (int i = 1; i < customers.length; i++) {
            finishTime = Math.max(customers[i][0], finishTime) + customers[i][1];
            allTime += finishTime - customers[i][0];
        }
        return (double) allTime / customers.length;
    }
}
