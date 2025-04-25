package T0485MaxConsecutiveOnes;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        for (int n : nums) {
            if (n == 1) {
                count++;
            } else {
                result = Math.max(count, result);
                count = 0;
            }
        }
        return Math.max(count, result);
    }
}
