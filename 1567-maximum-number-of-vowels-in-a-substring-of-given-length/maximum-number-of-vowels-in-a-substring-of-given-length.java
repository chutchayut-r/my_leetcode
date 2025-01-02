class Solution {
    public int maxVowels(String s, int k) {
        int maxNumVowel = 0;
        char[] chars = s.toCharArray();

        String window = s.substring(0,k);
        maxNumVowel = countNumberOfVowel(window.toCharArray());

        int curNumVowel = maxNumVowel;

        for (int round = 0; round < s.length()-k; round++) {

            if (maxNumVowel == k) {
                return  k;  // maxNumVomel cannot better than K value.
            }


            char removeChar = chars[round];
            char addChar = chars[round+k];

            if(isVowel(removeChar)){
                curNumVowel--;
            }
            if (isVowel(addChar)) {
                curNumVowel++;
            }

            maxNumVowel = Math.max(maxNumVowel,curNumVowel);
        }

        return maxNumVowel;
    }

    public int countNumberOfVowel(char[] window) {
        int vowelNum = 0;


        for (char c : window) { // check c is vowel and count the vowel number.
            if (isVowel(c)) {
                vowelNum++;
            }
        }

        return vowelNum;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}