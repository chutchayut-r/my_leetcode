class Solution {
    public String reverseVowels(String s) {
        char[] sentense = s.toCharArray();
        boolean[] vowelsFlag = new boolean[sentense.length];
        boolean[] vowels = new boolean[128];   // 1 byte Max value = 128;
        for(char c :"aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }

        for (int i = 0; i < sentense.length; i++) {
            vowelsFlag[i] = vowels[sentense[i]];
        }

        int right_index = sentense.length-1;
        for (int left_index = 0; left_index < sentense.length; left_index++) {

            if (vowelsFlag[left_index]) {
                while (right_index >= 0) {

                    if (vowelsFlag[right_index]) {

                        char temp = sentense[left_index];

                        sentense[left_index] = sentense[right_index];
                        sentense[right_index] = temp;
                        right_index--;
                        break;
                    }
                    right_index--;
                }
            }

            if (left_index >= right_index) {
                break;
            }
        }

        return String.valueOf(sentense);
    }
}