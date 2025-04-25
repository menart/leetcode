package T0005LongestPalindromicSubstring;

public class Solution {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String palindrome = getPalindrome(s, i, i);
            result = palindrome.length() > result.length() ? palindrome : result;
            palindrome = getPalindrome(s, i, i+1);
            result = palindrome.length() > result.length() ? palindrome : result;
        }
        return result;
    }

    private static String getPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}
