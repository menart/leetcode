package T0014LongestCommonPrefix;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] result = strs[0].toCharArray();
        for (int i = 1; i < strs.length; i++) {
            char[] other = strs[i].toCharArray();
            int l = 0;
            while (result.length > l && result[l] == other[l]) {
                l++;
            }
            if (l > 0) result = Arrays.copyOf(result, l);
            else return "";
        }
        return String.copyValueOf(result);
    }
}