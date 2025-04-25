package T0151ReverseWordsInAString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        List<String> strs = new ArrayList<>(Arrays.stream(s.trim().split("\\s+")).map(String::trim).toList());
        Collections.reverse(strs);
        System.gc();
        return String.join(" ", strs);
    }

    public static String reverseWords2(String s) {
        char[] chars = s.trim().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length; i >0 ; i--) {

        }
        return s;
    }
}
