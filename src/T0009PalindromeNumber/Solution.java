package T0009PalindromeNumber;

import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> list = List.of(121, -121, 10, 1919, 99, 4554);
        for (int number : list) {
            System.out.println(number + " - " + solution.isPalindrome(number));
        }
    }

    public boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;
        if(x < 0){
            return false;
        }
        while(x != 0){
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return (reverse == original);
    }
}