class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
        {
            return false;
        }
        // Do all the letters in the randomNote exist in the magazine?
        // Construct into a array of chars
        List<Character> ransomNoteChars = new ArrayList<>();
        List<Character> magazineChars = new ArrayList<>();
        for (int i = 0; i < ransomNote.length(); i++)
        {
            ransomNoteChars.add(ransomNote.charAt(i));
        }

        for (int i = 0; i < magazine.length(); i++)
        {
            magazineChars.add(magazine.charAt(i));
        }


        for (Character ransomNoteChar : ransomNoteChars){
            if (!magazineChars.contains(ransomNoteChar))
            {
                System.out.println(ransomNoteChar);
                System.out.println(magazineChars);

                return false;
            }
            magazineChars.remove(ransomNoteChar);
        }

        return true;
    }
}