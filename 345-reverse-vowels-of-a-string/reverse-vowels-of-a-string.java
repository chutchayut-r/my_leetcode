class Solution {
    public String reverseVowels(String s) {
        char[] sentense = s.toCharArray();
        boolean[] vowelsFlag = new boolean[sentense.length];
        char[] vowels = "aeiouAEIOU".toCharArray();

        for (int i = 0; i < sentense.length; i++) {
            vowelsFlag[i] = false;

            for (char v : vowels) {
                if (v == sentense[i]) {
                    vowelsFlag[i] = true;
                }
            }
        }

        int right_index = sentense.length-1;
        for (int left_index = 0; left_index < sentense.length; left_index++) {

            if (vowelsFlag[left_index]) {
                while (right_index >= 0) {

                    if (vowelsFlag[right_index]) {
                        vowelsFlag[right_index] = false;
                        vowelsFlag[left_index] = false;

                        char tmp = sentense[left_index];
                        sentense[left_index] = sentense[right_index];
                        sentense[right_index] = tmp;
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