class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Keep a count for each english char. 
        // Whereby the index is the alphabet index
        if (ransomNote.length() > magazine.length())
        {
            return false;
        }

        int[] alphabet = new int[26];

        for (int i = 0; i < magazine.length(); i++)
        {
            alphabet[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++)
        {
            if (alphabet[ransomNote.charAt(i) - 'a'] <= 0)
            {
                return false;
            }
            alphabet[ransomNote.charAt(i) - 'a']--;
        }

        return true;
    }
}