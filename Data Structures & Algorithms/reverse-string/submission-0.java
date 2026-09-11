class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        // Get end value, get start value, replace
        // Move in one
        // Until they meet

        while (start < end){
            char startVal = s[start];
            char endVal = s[end];
            s[start] = endVal;
            s[end] = startVal;

            start += 1;
            end -= 1;
        }
    }
}