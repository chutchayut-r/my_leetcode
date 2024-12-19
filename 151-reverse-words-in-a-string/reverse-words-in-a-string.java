class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int p2;

        for (int p1 = 0; p1 < s.length(); p1++) {
           
            if (chars[p1] != ' ') {
                p2 = p1 +1;

                while (p2 < s.length()) {
                    if (chars[p2] == ' ') {
                        break;
                    } else {
                       p2++;
                    }
                }
                if (sb.length() > 0) {
                    sb.insert(0,' ');
                }
                sb.insert(0,s.substring(p1,p2));
                p1 = p2;
            }
        }

        return  sb.toString();
    }
}