class Solution {
    public int numIslands(char[][] grid) {
        // Graph
        // DFS through the cells
        // If seen a cell then mark as seen aka 0


        int count = 0;
        for (int y = 0; y < grid.length; y++)
        {
            for (int x = 0; x < grid[0].length; x++)
            {
                if (grid[y][x] == '1')
                {
                    dfs(grid, x, y);
                    count += 1;
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int x, int y)
    {
        // set cell as 0
        // DFS left,right,up,down
        grid[y][x] = '0';

        // Each DFS traversal is an island
        if (x - 1 >= 0 && grid[y][x-1] == '1')
        {
            dfs(grid, x - 1, y);
        }

        if (y - 1 >= 0 && grid[y-1][x] == '1')
        {
            dfs(grid, x, y - 1);
        }

        if (x + 1 < grid[0].length && grid[y][x+1] == '1')
        {
            dfs(grid, x + 1, y);
        }

        if (y + 1 < grid.length && grid[y+1][x] == '1')
        {
            dfs(grid, x, y + 1);
        }
    }
}
