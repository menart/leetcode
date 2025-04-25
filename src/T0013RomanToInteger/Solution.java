package T0013RomanToInteger;

class Solution {
    public static void main(String[] args) {
        System.out.printf("%d%n", romanToInt("III"));
        System.out.printf("%d%n", romanToInt("LVIII"));
        System.out.printf("%d%n", romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            switch (ch[i]) {
                case 'I' -> {
                    result++;
                }
                case 'V' -> {
                    if (i > 0 && ch[i - 1] == 'I') {
                        i--;
                        result += 4;
                    } else
                        result += 5;
                }
                case 'X' -> {
                    if (i > 0 && ch[i - 1] == 'I') {
                        i--;
                        result += 9;
                    } else
                        result += 10;
                }
                case 'L' -> {
                    if (i > 0 && ch[i - 1] == 'X') {
                        i--;
                        result += 40;
                    } else
                        result += 50;
                }
                case 'C' -> {
                    if (i > 0 && ch[i - 1] == 'X') {
                        i--;
                        result += 90;
                    } else
                        result += 100;
                }
                case 'D' -> {
                    if (i > 0 && ch[i - 1] == 'C') {
                        i--;
                        result += 400;
                    } else
                        result += 500;
                }
                case 'M' -> {
                    if (i > 0 && ch[i - 1] == 'C') {
                        i--;
                        result += 900;
                    } else
                        result += 1000;
                }
            }
        }
        return result;
    }
}