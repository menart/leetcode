package T0209MinimumSizeSubarraySum;

public class Solution {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int slow = 0;
        for(int fast = 0 ; fast < nums.length ; fast++){
            sum += nums[fast];
            while(sum >= target){
                result = Math.min(result, fast - slow + 1);
                sum -= nums[slow];
                slow++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
