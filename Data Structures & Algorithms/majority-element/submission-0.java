class Solution {
    public int majorityElement(int[] nums) {
        // Brute force
        // Keep a map of each element as a key, where the value is the count
        // in O(1) space
        int candidate = 0;
        int count = 0;

        for (int num : nums)
        {
            if (count == 0)
            {   
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}