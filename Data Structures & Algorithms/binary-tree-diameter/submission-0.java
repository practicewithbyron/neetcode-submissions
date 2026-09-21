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
        diameter(root);

        return maxDiameter;
    }

    private int diameter(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        int left = diameter(root.left);
        int right = diameter(root.right);

        maxDiameter = Math.max(maxDiameter, left + right);

        // Return the highest depth, plus one to include itself
        return Math.max(left, right) + 1;
    }
}
