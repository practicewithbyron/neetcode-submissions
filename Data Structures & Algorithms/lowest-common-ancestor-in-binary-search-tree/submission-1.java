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
    private TreeNode lca;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return lca;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q)
    {
        if (root == null)
        {
            return false;
        }

        // Pass up a boolean whether in a given path, p or q exists
        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);

        if (left && right || left && (root.val == q.val || root.val == p.val) || right && (root.val == q.val || root.val == p.val))
        {
            lca = root;
        }

        if (left || right)
        {
            return true;
        }

        return (root.val == p.val) || (root.val == q.val);
    }
}
