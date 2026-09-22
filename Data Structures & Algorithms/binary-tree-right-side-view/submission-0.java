/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private final List<List<Integer>> levels = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        // Determine if there is something to the right of a node??
        // The complete right -> right -> right...]
        // Keep track of levels as arrays
        // Traverse to build the array
        // Get the last value of each array
        bfs(root, 0);

        List<Integer> result = new ArrayList<>();
        for (var level : levels)
        {
            result.add(level.get(level.size() - 1));
        }

        return result;
    }

    private void bfs(TreeNode node, int depth)
    {
        if (node == null )
        {
            return;
        }

        if (levels.size() < depth + 1)
        {
            levels.add(new ArrayList<>());
        }

        bfs(node.left, depth + 1);
        bfs(node.right, depth + 1);

        levels.get(depth).add(node.val);
    }
}
