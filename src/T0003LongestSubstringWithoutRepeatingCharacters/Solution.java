package T0003LongestSubstringWithoutRepeatingCharacters;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abccba"));
    }

    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int[] seen = new int[256];
        for (int i = 0, j = 0; j < s.length(); j++) {
            i = Math.max(i, seen[s.charAt(j)]);
            count = Math.max(count, j - i + 1);
            seen[s.charAt(j)] = j + 1;
        }

        return count;
    }

}
