package T0349IntersectionOfTwoArrays;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] list = new int[]{};
        int left = 0, right = 0;
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                if (list.length == 0 || list[list.length - 1] != nums1[left]) {
                    list = Arrays.copyOf(list, list.length + 1);
                    list[list.length-1] = nums1[left];
                }
                left++;
            } else {
                if (nums1[left] > nums2[right]) {
                    right++;
                } else {
                    left++;
                }
            }

        }
        return list;
    }
}
