class LRUCache {
    // HashMap?
    // Get/Put is O(1) which is a hashmap
    // Stack to keep track of key usage
    // Every operation, remove the value from the hash
    private final Map<Integer, Integer> values = new HashMap<>();
    private final Deque<Integer> stack = new ArrayDeque<>();
    private final int maxCapacity;

    public LRUCache(int capacity) {
        maxCapacity = capacity;
    }
    
    public int get(int key) {
        // Remove key from stack, and re-add it if exists
        // If not, check we're not add the max, then add it and remove the last
        // getOrDefault
        int value = values.getOrDefault(key, -1);
        if (value != -1)
        {
            if(stack.contains(key))
            {
                stack.remove(key);
                stack.addFirst(key);
            }
            else if (stack.size() >= maxCapacity)
            {
                // Remove the value thats fallen out of the stack
                int toRemove = stack.pollLast();
                values.remove(toRemove);
                stack.addFirst(key);
            }
            else
            {
                // Or just add to the stack
                stack.addFirst(key);
            }
            return value;
        }
        else
        {
            // If the value is not present, then the stack shouldnt be updated.
            return -1;
        }

    }
    
    public void put(int key, int value) {
        // Same again, update stack accordingly
        updateValues(key, value);
    }

    private void updateStack(int key)
    {

    }

    private void updateValues(int key, int value)
    {
        if(stack.contains(key))
        {
            // Already in the map
            // This means move it to the top of the stack
            // Update the value in the map
            stack.remove(key);
            stack.addFirst(key);
            values.put(key, value);
        }
        else if (stack.size() >= maxCapacity)
        {
            // If limit is reached
            // Must remove a value from the bottom
            // Add new value to the top
            stack.addFirst(key);
            int valueRemoved = stack.pollLast();
            values.remove(valueRemoved);
            values.put(key, value);
        }
        else
        {
            // If not just add the value to the stack
            // And update the map
            stack.addFirst(key);
            values.put(key, value);
        }
    }
}
