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
                    if (str.length() <= i|| str.charAt(i) != strs[0].charAt(i))
                {
                    return toReturn;
                }
                

            }

            toReturn = String.format("%s%s", toReturn, strs[0].charAt(i));
        }

        return toReturn;
    }
}