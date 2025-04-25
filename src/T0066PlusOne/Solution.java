package T0066PlusOne;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9, 9, 9})));
    }

    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        int position = digits.length - 1;
        while (true) {
            digits[position] = 0;
            if (position < 1) {
                return copyArray(digits);
            }
            if (digits[position - 1] < 9) {
                digits[position - 1] += 1;
                return digits;
            } else {
                position--;
            }
        }
    }

    private static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = 1;
        System.arraycopy(array, 0, newArray, 1, array.length);
        return newArray;
    }
}
