package T0074SearchA2DMatrix;

public class Solution {

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
        System.out.println(searchMatrix(new int[][]{{1}, {2}}, 2));
        System.out.println(searchMatrix(new int[][]{{1}}, 2));
        System.out.println(searchMatrix(new int[][]{{1, 1}}, 2));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0, j = m - 1;

        while(i < n && j >= 0){
            if(matrix[i][j] == target)return true;

            if(matrix[i][j] < target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
