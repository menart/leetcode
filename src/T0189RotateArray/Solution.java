package T0189RotateArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Solution().rotate(ints, 3);
        System.out.println(Arrays.toString(ints));
    }

    public void rotate(int[] nums, int k) {
        // Assign the input array to the class-level variable

        // Number of elements in the array
        int n = nums.length;

        // Normalize the number of steps k to avoid extra rotations
        k %= n;

        // Reverse the entire array
        reverse(0, n - 1, nums);

        // Reverse the first part (up to k elements)
        reverse(0, k - 1, nums);

        // Reverse the second part (from k to the end of the array)
        reverse(k, n - 1, nums);
    }

    /**
     * Reverses elements in the array between indices i and j.
     * @param i Starting index for reversal.
     * @param j Ending index for reversal.
     */
    private void reverse(int i, int j , int[] nums) {
        // Using two pointers approach, swap elements until pointers meet or cross
        while (i < j) {
            // Temporary variable to hold a value during the swap
            int temp = nums[i];

            // Perform swap
            nums[i] = nums[j];
            nums[j] = temp;

            // Move pointers towards each other
            ++i;
            --j;
        }
    }
}


