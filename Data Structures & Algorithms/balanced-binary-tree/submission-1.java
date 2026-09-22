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
    private boolean isBalanced_ = true;
    public boolean isBalanced(TreeNode root) {

        if (root == null)
        {
            return true;
        }

        getHeight(root);

        return isBalanced_;
    }

    private int getHeight(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        if (!((left + 1 == right) || (right + 1 == left) || (left == right)))
        {            
            isBalanced_ = false;
        }

        return Math.max(left, right) + 1;
    }
}
