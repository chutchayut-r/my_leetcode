class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s_ary = s.toCharArray();
        char[] t_ary = t.toCharArray();
        
        int t_point = 0;
        int s_point = 0;

        while (t_point < t.length() && s_point < s.length()) {
            if (s_ary[s_point] == t_ary[t_point]) {
                s_point++;
            }
            t_point++;
        }

        return s_point == s.length();
    }
}