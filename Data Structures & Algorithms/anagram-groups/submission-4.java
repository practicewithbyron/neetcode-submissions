class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Group by char count or sum of ordinal

        // Loop throuh strs
        // Find the ordinal of that string
        // Add to map, ord: [[str]]
        // Return all the values as a single list

        HashMap<String, List<String>> anagram_map = new HashMap<>();

        for (int i = 0; i < strs.length; i++)
        {
            // Forget ordinal, just sort the val and use as the key
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            anagram_map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }

        // System.out.println(anagram_map);

        List<List<String>> to_return = new ArrayList<>();

        for (String key : anagram_map.keySet())
        {
            to_return.add(anagram_map.get(key));
        }

        return to_return;
    }
}
