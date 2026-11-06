class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        // DFS
        // Keep track of island size
        for (int y = 0; y < grid.length; y++)
        {
            for (int x = 0; x < grid[0].length; x++)
            {
                if (grid[y][x] == 1)
                {
                    int size = dfs(grid, x, y);
                    System.out.println(size);
                    maxArea = Math.max(size, maxArea);
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int x, int y)
    {
        int size = 1;

        // Pass size up?
        grid[y][x] = 0;

        if (x - 1 >= 0 && grid[y][x-1] == 1)
        {
            size += dfs(grid, x - 1, y);
        }
         
        if (y - 1 >= 0 && grid[y-1][x] == 1)
        {
            size += dfs(grid, x, y - 1);
        }

        if (x + 1 < grid[0].length && grid[y][x+1] == 1)
        {
            size += dfs(grid, x + 1, y);
        }

        if (y + 1 < grid.length && grid[y+1][x] == 1)
        {
            size += dfs(grid, x, y + 1);  
        }

        return size;
    }
}
