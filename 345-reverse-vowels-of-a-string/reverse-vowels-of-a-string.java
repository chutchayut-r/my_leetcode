class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        HashMap<Character, Boolean> map = new HashMap<>();
        Stack<Character> vowelsStack = new Stack<>();
        Queue<Integer> indexQueue = new LinkedList<>();

        map.put('a', true);
        map.put('e', true);
        map.put('i', true);
        map.put('o', true);
        map.put('u', true);

        map.put('A', true);
        map.put('E', true);
        map.put('I', true);
        map.put('O', true);
        map.put('U', true);


        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (map.containsKey(letter)) {
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