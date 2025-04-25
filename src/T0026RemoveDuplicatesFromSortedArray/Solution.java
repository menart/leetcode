package T0026RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2});
    }

    public static int removeDuplicates(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                p++;
                nums[p] = nums[i];
            }
        }
        return p+1;
    }
}
