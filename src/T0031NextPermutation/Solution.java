package T0031NextPermutation;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextPermutation(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(nextPermutation(new int[]{3, 2, 1})));
        System.out.println(Arrays.toString(nextPermutation(new int[]{1, 1, 5})));
    }

    public static int[] nextPermutation(int[] nums) {
        int largest = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                largest = i;
                break;
            }
        }
        if (largest == -1) {
            reverse(nums, 0);
            return nums;
        }
        int secondLargest = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[largest]) {
                secondLargest = i;
                break;
            }
        }
        swap(nums, largest, secondLargest);
        reverse(nums, largest + 1);
        return nums;
    }

    private static void swap(int[] nums, int first, int second) {
        int tmp = nums[first];
        nums[first] = nums[second];
        nums[second] = tmp;
    }

    private static void reverse(int[] nums, int first) {
        int left = first;
        int right = nums.length - 1;
        while (right > left) {
            swap(nums, left++, right--);
        }
    }
}
