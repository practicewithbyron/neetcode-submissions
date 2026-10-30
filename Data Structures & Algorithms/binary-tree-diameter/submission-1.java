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
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter;
    }

    private int dfs(TreeNode node)
    {
        // Each node needs to pass up information about its given depth, the diameter, is then the max depth of the left and right node
        if (node == null)
        {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);

        // Pass up the height of the node
        // But the diameter is the length of left + right
        maxDiameter = Math.max(maxDiameter, left + right);

        return Math.max(left, right) + 1; // passing up the best depth + 1 aka itself.
    }
}
