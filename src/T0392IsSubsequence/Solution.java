package T0392IsSubsequence;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        var chs = s.toCharArray();
        int position = 0;
        for (char ch : t.toCharArray()) {
            if (ch == chs[position]) {
                if (++position == chs.length) return true;
            }
        }
        return false;
    }
}
