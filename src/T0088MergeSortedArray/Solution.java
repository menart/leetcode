package T0088MergeSortedArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] int1 = new int[]{1, 2, 9, 0, 0, 0};
        new Solution().merge(int1, 3, new int[]{1, 5, 6}, 3);
        System.out.println(Arrays.toString(int1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // nums1's index (the actual nums)
        int j = n - 1;     // nums2's index
        int k = m + n - 1; // nums1's index (the next filled position)

        while (j >= 0)
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
    }
}
