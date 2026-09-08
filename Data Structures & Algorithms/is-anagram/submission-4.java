class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphabet_count = new int[26];

        // Increase counts
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            System.out.println(index);
            alphabet_count[index] = alphabet_count[index] + 1;
        }

        // Decrease counts
        for (char c : t.toCharArray()) {
            int index = c - 'a';
            alphabet_count[index] = alphabet_count[index] - 1;
        }

        for (int value : alphabet_count) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}