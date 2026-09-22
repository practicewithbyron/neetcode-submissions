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
    private boolean isEqual = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        traverse(root, subRoot);
        return isEqual;
    }

    public void traverse(TreeNode root, TreeNode subRoot)
    {
        if (root == null)
        {
            return;
        }

        traverse(root.left, subRoot);
        traverse(root.right, subRoot);

        // Or when we reach a node with the same node as subRoot, 
        if (root.val == subRoot.val)
        {
            if (isEqual(root, subRoot))
            {
                System.out.println(root.val);
                System.out.println(subRoot.val);
                isEqual = true;
            }
        }
    }

    private boolean isEqual(TreeNode first, TreeNode second)
    {
        if (first == null && second == null)
        {
            // Cool they're both null
            return true;
        }

        if (first == null || second == null)
        {
            // Because of the first if, this must be an either or
            return false;
        }

        if (first.val != second.val)
        {
            return false;
        }

        return isEqual(first.left, second.left) && isEqual(first.right, second.right);
    }
}
