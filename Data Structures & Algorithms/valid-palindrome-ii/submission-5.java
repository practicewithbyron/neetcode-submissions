class Solution {
    public boolean validPalindrome(String s) {
        // Two pointers, if we hit a failure, remove char
        int pointer1 = 0;
        int pointer2 = s.length() - 1;
        int failureRightIndex = -1;
        int failureLeftIndex = -1;

        if (s.length() <= 2)
        {
            return true;
        }

        String newString = "";

        while (pointer1 < pointer2)
        {
            if (s.charAt(pointer1) != s.charAt(pointer2))
            {
                failureRightIndex = pointer2;
                failureLeftIndex = pointer1;

                break;
            }

            pointer1 += 1;
            pointer2 -= 1;
        }

        if (failureLeftIndex != -1)
        {
            newString = s.substring(0, failureLeftIndex) + s.substring(failureLeftIndex + 1);
        }

        pointer1 = 0;
        pointer2 = newString.length() - 1;

        boolean resultLeft = true;
        boolean resultRight = true;

        while (pointer1 < pointer2)
        {
            if (newString.charAt(pointer1) != newString.charAt(pointer2))
            {
                resultLeft = false;
                break;
            }

            pointer1 += 1;
            pointer2 -= 1;
        }

        if (failureRightIndex != -1)
        {
            newString = s.substring(0, failureRightIndex) + s.substring(failureRightIndex + 1);
        }

        pointer1 = 0;
        pointer2 = newString.length() - 1;

        while (pointer1 < pointer2)
        {
            if (newString.charAt(pointer1) != newString.charAt(pointer2))
            {
                resultRight = false;
                break;
            }

            pointer1 += 1;
            pointer2 -= 1;
        }

        if (resultLeft || resultRight)
        {
            return true;
        }

        return false;

    }

}