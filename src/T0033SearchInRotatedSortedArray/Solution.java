package T0033SearchInRotatedSortedArray;

public class Solution {

    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(search(new int[]{3, 1}, 1));
        System.out.println(search(new int[]{8, 9, 2, 3, 4}, 9));
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7));
        System.out.println(search(new int[]{3, 1}, 4));
        System.out.println(search(new int[]{3, 1}, 3));
        System.out.println(search(new int[]{0, 1, 2, 3, 4, 5, 6}, 0));
        System.out.println(search(new int[]{1, 3}, 0));
        System.out.println(search(new int[]{1}, 2));
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        System.out.println(search(new int[]{1}, 0));
    }

    //1,2,3,4,5,6,7 2
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Проверяем, отсортирована ли левая половина
            if (nums[left] <= nums[mid]) {
                // Цель в левой отсортированной половине
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // Правая половина отсортирована
                // Цель в правой отсортированной половине
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
//        int low = 0;
//        int high = nums.length -1;
//        int first = nums[0];
//        while (low <= high) {
//            int mid = low + ((high - low) / 2);
//            if (nums[mid] == target) {
//                result = mid;
//                break;
//            }
//            int tmp = (nums[mid] - first) > target && first > target ? first - nums[mid] : nums[mid];
//            if (tmp < target) {
//                low = mid + 1;
//            }
//            if (tmp > target) {
//                high = mid - 1;
//            }
//        }
//
    }
}
