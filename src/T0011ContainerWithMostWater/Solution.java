package T0011ContainerWithMostWater;

class Solution {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{1, 1}));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int square = 0;
        while (left < right) {
            int range = right - left;
            int max = Math.min(height[left], height[right]);
            square = Math.max(square, range * max);
            while (left < right && height[left] <= max) {
                left++;
            }
            while (left < right && height[right] <= max) {
                right--;
            }
        }
        return square;
    }
}