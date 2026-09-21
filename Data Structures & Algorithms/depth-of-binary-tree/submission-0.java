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
    private int curMaxDepth = 0;
    public int maxDepth(TreeNode root) {
        bfs(root, 0);
        return curMaxDepth;
    }

    private void bfs(TreeNode root, int depth)
    {
        if (root == null)
        {
            if (depth > curMaxDepth)
            {
                curMaxDepth = depth;
            }
            return;
        }

        bfs(root.left, depth + 1);
        bfs(root.right, depth + 1);

        return;
    }
}
