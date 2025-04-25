package T0020ValidParentheses;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("["));
    }

    public static boolean isValid(String s) {
        Stack<Character> hes = new Stack<>();
        boolean result = false;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '{', '[', '(' -> {
                    hes.push(ch);
                    result = false;
                }
                case '}' -> {
                    if (hes.empty() || hes.pop() != '{') {
                        return false;
                    }
                    else {
                        if (hes.empty()) result = true;
                    }
                }
                case ']' -> {
                    if (hes.empty() || hes.pop() != '[')  {
                        return false;
                    }
                    else {
                        if (hes.empty()) result = true;
                    }
                }
                case ')' -> {
                    if (hes.empty() || hes.pop() != '(')  {
                        return false;
                    }
                    else {
                        if (hes.empty()) result = true;
                    }
                }
            }
        }
        return result;
    }
}