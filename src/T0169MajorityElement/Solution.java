package T0169MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{3, 2, 3}));
        System.out.println(new Solution().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Iterate over all elements in the array
        for (int num : nums) {
            // If count is zero, we choose the current element as the new candidate
            if (count == 0) {
                candidate = num;
                count = 1;
            } else {
                // If the current element is the same as the candidate, increment count
                if (num == candidate) {
                    count++;
                } else {
                    // If different, decrement count
                    count--;
                }
            }
        }

        // The candidate is the majority element, which is guaranteed to exist
        return candidate;
    }
}
