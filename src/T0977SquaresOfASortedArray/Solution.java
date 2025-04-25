package T0977SquaresOfASortedArray;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, 7})));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int k = nums.length - 1;
        while (left <= right) {
            int leftQ = nums[left] * nums[left];
            int rightQ = nums[right] * nums[right];
            if (leftQ >= rightQ) {
                result[k] = leftQ;
                left++;
            }
            if (leftQ < rightQ) {
                result[k] = rightQ;
                right--;
            }
            k--;
        }
        return result;
    }
}
