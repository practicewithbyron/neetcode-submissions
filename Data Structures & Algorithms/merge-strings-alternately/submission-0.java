class Solution {
    public String mergeAlternately(String word1, String word2) {
        int pointer1 = 0;
        int pointer2 = 0;

        String toReturn = "";

        while (pointer1 < word1.length() || pointer2 < word2.length())
        {
            if (pointer1 < word1.length())
            {
                toReturn = String.format("%s%s", toReturn, word1.charAt(pointer1));
                pointer1 += 1;
            }

            if (pointer2 < word2.length())
            {
                toReturn = String.format("%s%s", toReturn, word2.charAt(pointer2));
                pointer2 += 1;
            }
        }

        return toReturn;
    }
}