package T0523ContinuousSubarraySum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
        System.out.println(checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
        System.out.println(checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 13));
        System.out.println(checkSubarraySum(new int[]{5, 0, 0, 0}, 3));
        System.out.println(checkSubarraySum(new int[]{23, 2, 6, 2, 5}, 6));
        System.out.println(checkSubarraySum(new int[]{0, 1, 0, 3, 0, 4, 0, 4, 0}, 5));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> d = new HashMap<>();
        d.put(0, -1);
        int s = 0;
        for (int i = 0; i < nums.length; ++i) {
            s = (s + nums[i]) % k;
            if (!d.containsKey(s)) {
                d.put(s, i);
            } else if (i - d.get(s) > 1) {
                return true;
            }
        }
        return false;
    }
}
