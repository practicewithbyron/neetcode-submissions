class Solution {
    public int[] getConcatenation(int[] nums) {
        // Double the array?

        int[] toReturn = new int[nums.length * 2];

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                toReturn[j + (i * nums.length)] = nums[j];
            }
        }

        return toReturn;

    }
}