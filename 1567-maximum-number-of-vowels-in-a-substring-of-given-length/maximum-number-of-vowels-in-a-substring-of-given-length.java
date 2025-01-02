class Solution {
    public int maxVowels(String s, int k) {
        int maxNumVowel = 0;
        char[] chars = s.toCharArray();
        // a (byte = 97) to z (byte = 122)
        int[] vowelMap = new int[123];
        int curNumVowel = 0;

        vowelMap['a'] = 1;
        vowelMap['e'] = 1;
        vowelMap['i'] = 1;
        vowelMap['o'] = 1;
        vowelMap['u'] = 1;
        // default value of int is 0.

        for (int index =0; index<k; index++) {
            curNumVowel += vowelMap[chars[index]];
            maxNumVowel = curNumVowel;
        }


        for (int round = 0; round < s.length()-k; round++) {

            if (maxNumVowel == k) {
                return  k;  // maxNumVomel cannot better than K value.
            }

            char removeChar = chars[round];
            char addChar = chars[round+k];

            curNumVowel -= vowelMap[removeChar];
            curNumVowel += vowelMap[addChar];

            maxNumVowel = maxNumVowel < curNumVowel ? curNumVowel:maxNumVowel;
        }

        return maxNumVowel;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}