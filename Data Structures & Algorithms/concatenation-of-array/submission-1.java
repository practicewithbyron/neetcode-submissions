class Solution {
    public int[] getConcatenation(int[] nums) {
        // Double the array?

        int[] toReturn = new int[nums.length * 2];

        for (int j = 0; j < nums.length; j++)
        {
            toReturn[j] = nums[j];
            toReturn[j+nums.length] = nums[j];
        }
    

        return toReturn;

    }
}