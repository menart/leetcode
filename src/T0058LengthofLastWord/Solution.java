package T0058LengthofLastWord;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("Hello World"));
        System.out.println(new Solution().lengthOfLastWord("   fly me   to   the moon  "));
    }

    public int lengthOfLastWord(String s) {
        var newS = s.trim();
        int last = newS.lastIndexOf(' ');
        return newS.substring(last+1).length();
    }
}
