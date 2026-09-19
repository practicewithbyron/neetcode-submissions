class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Brute force
        // Iterate through every el at index i
        // If all equal, then add

        String toReturn = "";
        for (int i = 0; i < strs[0].length(); i++)
        {
            for (String str : strs)
            {
                try {
                    if (str.length() < i - 1 || str.charAt(i) != strs[0].charAt(i))
                    {
                        return toReturn;
                    }
                }
                catch( final StringIndexOutOfBoundsException e )
                {
                    return toReturn;
                }

            }

            toReturn = String.format("%s%s", toReturn, strs[0].charAt(i));
        }

        return toReturn;
    }
}