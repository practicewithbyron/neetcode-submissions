class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // Traverse thru
        // forward asteroids
        // When we see a backwards one, or atleast one it the opposite direction
        // get the last asteroid added
        // Remove the one that is smaller from their stack
        // return what is left?

        List<Integer> asteroidStack = new ArrayList<>();

        for (int asteroid : asteroids)
        {
            if (asteroid > 0)
            {
                asteroidStack.add(asteroid);
            }
            else
            {
                // While the stack isn't empty (cannot delete off nothing), asteroid is negative and we have forward facing asteroids on the stack
                boolean asteroidDestroyed = false;
                while (asteroidStack.size() != 0 && asteroid < 0 && asteroidStack.get(asteroidStack.size() - 1) > 0)
                {
                    if (asteroid * -1 == asteroidStack.get(asteroidStack.size() - 1))
                    {
                        asteroidStack.remove(asteroidStack.size() - 1);
                        asteroidDestroyed = true;
                        break;
                    }
                    else if (asteroid * -1 > asteroidStack.get(asteroidStack.size() - 1))
                    {
                        asteroidStack.remove(asteroidStack.size() - 1);
                    }
                    else
                    {
                        asteroidDestroyed = true;
                        break;
                    }
                }

                if (!asteroidDestroyed)
                {
                    asteroidStack.add(asteroid);
                }
            }
        }

        return asteroidStack.stream().mapToInt(Integer::intValue).toArray();
    }
}