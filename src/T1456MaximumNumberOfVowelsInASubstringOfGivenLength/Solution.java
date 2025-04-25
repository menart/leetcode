package T1456MaximumNumberOfVowelsInASubstringOfGivenLength;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {

    }

    public static int maxVowels(String s, int k) {
        char[] ar = s.toCharArray();
        int max = 0;
        int j = 0;
        int sum = 0;
        while (j < k) {
            if (isVowel(ar[j])) {
                sum++;
            }
            j++;
        }
        int n = s.length();
        max = sum;
        while (j < n) {

            sum = sum + (isVowel(ar[j]) ? 1 : 0) - (isVowel(ar[j - k]) ? 1 : 0);
            j++;
            if(sum>max){
                max=sum;
            }
        }
        System.gc();
        return max;
    }
    public static boolean isVowel(char ch){
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                return true;
            }
        }
        return false;
    }

}
