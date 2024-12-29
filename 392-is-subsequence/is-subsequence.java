class Solution {
   public boolean isSubsequence(String s, String t) {
        int t_point = 0;
        int s_point = 0;

        while (t_point < t.length() && s_point < s.length()) {
            if (s.charAt(s_point) == t.charAt(t_point)) {
                s_point++;
            }
            t_point++;
        }

        return s_point == s.length();
    }
}