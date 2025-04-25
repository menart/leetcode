package T0008StringToInteger;

public class Solution {

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi(" -042"));
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("0-1"));
        System.out.println(myAtoi("words and 987"));
    }

    public static int myAtoi(String s) {
        char[] chars = s.trim().toCharArray();
        if(chars.length == 0) return 0;
        long result = 0;
        int negative = 1;
        int start = 0;
        if (chars[0] == '-') {
            negative = -1;
            start = 1;
        }
        if (chars[0] == '+') {
            start = 1;
        }
        for (int i = start; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                result = result * 10;
                result += (chars[i] - '0');
                if (negative*result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (negative*result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            } else break;
        }
        return (int) result * negative;
    }

}
