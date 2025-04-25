package T1768MergeStringsAlternately;

public class Solution {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int first = 0;
        int second = 0;
        while (first < word1.length() && second < word2.length()) {
            stringBuilder.append(first == second ? word1.charAt(first++) : word2.charAt(second++));
        }
        if (first < word1.length()) stringBuilder.append(word1.substring(first));
        if (second < word2.length()) stringBuilder.append(word2.substring(second));
        return stringBuilder.toString();
    }
}
