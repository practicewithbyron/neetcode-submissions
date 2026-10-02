class Solution {
    public boolean isValid(String s) {
        List<String> openingBracketStack = new ArrayList<>();

        if (s.length() % 2 != 0)
        {
            return false;
        }

        for (int i = 0; i < s.length(); i++)
        {
            var character = s.charAt(i);
            if (character == '(' || character == '{' || character == '[')
            {
                openingBracketStack.add(String.valueOf(character));
            }
            else
            {
                int stackSize = openingBracketStack.size();
                if (stackSize < 1)
                {
                    return false;
                }

                if (character == ')' && openingBracketStack.get(stackSize - 1).equals("("))
                {
                    // Fine, remove from the top
                    openingBracketStack.remove(stackSize - 1);
                }
                else if (character == '}' && openingBracketStack.get(stackSize - 1).equals("{"))
                {
                    // Fine, remove from the top
                    openingBracketStack.remove(stackSize - 1);
                }
                else if (character == ']' && openingBracketStack.get(stackSize - 1).equals("["))
                {
                    // Fine, remove from the top
                    openingBracketStack.remove(stackSize - 1);
                }
                else
                {
                    System.out.println(character);
                    System.out.println(openingBracketStack.get(stackSize - 1));

                    return false;
                }
            }
        }

        return openingBracketStack.size() == 0;
    }
}
