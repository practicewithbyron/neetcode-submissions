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
    private int goodNodeCount = 0;
    public int goodNodes(TreeNode root) {
        // Pass down the max value
        dfs(root, root.val);
        return goodNodeCount;
    }

    private void dfs(TreeNode root, int pathMax)
    {
        if (root == null)
        {
            return;
        }

        if (root.val >= pathMax)
        {
            goodNodeCount += 1;
        }

        int curMax = Math.max(root.val, pathMax);

        dfs(root.left, curMax);
        dfs(root.right, curMax);
    }
}
