class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Character> vowelsStack = new Stack<>();
        Queue<Integer> indexQueue = new LinkedList<>();
        ArrayList<Character> vowelsList = new ArrayList<>();

        vowelsList.add('a');
        vowelsList.add('e');
        vowelsList.add('i');
        vowelsList.add('o');
        vowelsList.add('u');

        vowelsList.add('A');
        vowelsList.add('E');
        vowelsList.add('I');
        vowelsList.add('O');
        vowelsList.add('U');

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (vowelsList.contains(letter)) {
                vowelsStack.add(letter);
                indexQueue.add(i);
            }
        }

        while (!vowelsStack.empty() && !indexQueue.isEmpty()) {
            sb.setCharAt(indexQueue.poll(), vowelsStack.pop());
        }
        return sb.toString();
    }
}