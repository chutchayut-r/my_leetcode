class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        boolean beforeIsSpace = false;
        int wordCnt = 0;
        ArrayList words = new ArrayList(){};

        for (char charater : s.toCharArray()) {
            if (charater == ' ') {  // space
                if (!beforeIsSpace) {

                    if (!sb.isEmpty()) {
                        words.add(sb.toString());  // add word to word array.
                        wordCnt++;
                        sb.delete(0,sb.length());
                    }

                    beforeIsSpace = true;
                }
            } else {    // ASCII
                beforeIsSpace = false;
                sb.append(charater);
            }
        }

        // To support case, End index is not space.
        if (!sb.isEmpty()) {
            words.add(sb.toString());
            wordCnt++;
            sb.delete(0, sb.length());
        }

        for (int index = wordCnt-1; index >= 0 ; index--) {

            sb.append(words.get(index));
            if (index <= wordCnt-1 && index > 0) {
                sb.append(" ");
            }
        }

        return  sb.toString();
    }
}