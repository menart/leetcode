package T1248CountNumberOfNiceSubarrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3));
        System.out.println(numberOfSubarrays(new int[]{2, 4, 6}, 1));
        System.out.println(numberOfSubarrays(new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length; // Length of the input array
        int[] prefixOddCount = new int[n + 1]; // Array to keep track of the prefix sums of odd numbers
        prefixOddCount[0] = 1; // There's one way to have zero odd numbers - by taking no elements
        int result = 0; // Initialize the result count to 0
        int currentOddCount = 0; // Tracks the current number of odd elements encountered

        // Iterate over each number in the input array
        for (int num : nums) {
            // If 'num' is odd, increment the count of odd numbers encountered so far
            currentOddCount += num & 1;

            // If we have found at least 'k' odd numbers so far
            if (currentOddCount - k >= 0) {
                // Add to 'result' the number of subarrays that have 'k' odd numbers up to this point
                result += prefixOddCount[currentOddCount - k];
            }

            // Increment the count in our prefix sum array for the current odd count
            prefixOddCount[currentOddCount]++;
        }
        return result; // Return the total count of subarrays with exactly 'k' odd numbers
    }
}
