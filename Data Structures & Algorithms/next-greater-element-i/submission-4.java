class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Monotonic stack
        // Traverse
        // Keep a stack of numbers waiting for a greater element
        // Keep a map of the numbers and the index that beat them
        // stack = [1]
        // is 3 > 1
        // Yes so stack remove 1, stack add 3
        // Map.put 1, 3 aka the stack value and the greater val
        // 
        // is 4 > 3
        // Yes so stack remove 3, stack add 4
        // Map.put 3, 4, aka the stack value and the greater val
        // 
        // is 2 > 4
        // No so add 2 to the stack
        // 4 shouln't exist on the map as the next greatest element does not yet exist
        

        Deque<Integer> monotonicStack = new ArrayDeque<>();
        Map<Integer, Integer> monotonicMap = new HashMap<>();

        monotonicStack.add(nums2[0]);

        for (int i = 1; i < nums2.length; i++)
        {
            while (!monotonicStack.isEmpty()
                    && nums2[i] > monotonicStack.peek()) {

                int val = monotonicStack.pop();
                monotonicMap.put(val, nums2[i]);
                System.out.println(monotonicMap);
            }

            monotonicStack.push(nums2[i]);
            System.out.println(monotonicStack);
        }


        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++)
        {
            result[i] = monotonicMap.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}