class Solution {
    public int maxVowels(String s, int k) {
        int maxNumVowel = 0;
        char[] chars = s.toCharArray();
        
        for (int index = 0; index < k; index++) {
            if (this.isVowel(chars[index])) {
                maxNumVowel++;
            }
        }
        
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
    
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}