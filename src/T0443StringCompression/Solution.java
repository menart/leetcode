package T0443StringCompression;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println(compress(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'}));
    }

    public static int compress(char[] chars) {
        int count = 1;
        int position = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                if (count > 1) {
                    for (char ch : Integer.toString(count).toCharArray()) {
                        chars[position++] = ch;
                    }
                }
                count = 1;
                chars[position++] = chars[i];
            }
        }
        if (count > 1) {
            for (char ch : Integer.toString(count).toCharArray()) {
                chars[position++] = ch;
            }
        }
        return position;
    }
}
