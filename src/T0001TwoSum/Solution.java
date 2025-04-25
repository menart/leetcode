package T0001TwoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int findNumber = target - nums[i];
            Integer findIndex = map.get(findNumber);
            if (findIndex != null) {
                return new int[]{findIndex, i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
