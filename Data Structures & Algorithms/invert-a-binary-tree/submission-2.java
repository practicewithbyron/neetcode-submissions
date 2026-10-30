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
    public TreeNode invertTree(TreeNode root) {
        dfs(root);

        return root;
    }

    public void dfs(TreeNode node)
    {
        // For a given node, we need to swap the left with the right
        if (node == null)
        {
            return;
        }

        dfs(node.left);
        dfs(node.right);

        final TreeNode left = node.left;
        final TreeNode right = node.right;

        node.left = right;
        node.right = left;
    }
}
