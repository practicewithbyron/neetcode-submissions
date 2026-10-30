class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Characters in an anagram have the same numerical value
        // Length must be the same
        // Order each string, that becomes the key for the hashmap
        final Map<String, List<String>> output = new HashMap<>();

        for (String str : strs)
        {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            final String sortedStr = new String(charArray);
            final List<String> mapArray = output.getOrDefault(sortedStr, null);
            if (mapArray != null)
            {
                mapArray.add(str);
            }
            else
            {
                final List<String> temp = new ArrayList<>();
                temp.add(str);
                output.put(sortedStr, temp);
            }
        }

        final List<List<String>> result = new ArrayList<>();
        for (String anagramKey : output.keySet())
        {
            result.add(output.get(anagramKey));
        }

        return result;
    }
}
