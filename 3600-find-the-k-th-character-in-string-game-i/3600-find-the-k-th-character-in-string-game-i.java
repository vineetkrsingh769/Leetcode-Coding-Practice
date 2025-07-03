class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            int len = word.length();
            for (int i = 0; i < len && word.length() < k; i++) {
                char current = word.charAt(i);
                char next = (char)((current - 'a' + 1) % 26 + 'a');
                word.append(next);
            }
        }
        return word.charAt(k - 1);
    }
}
