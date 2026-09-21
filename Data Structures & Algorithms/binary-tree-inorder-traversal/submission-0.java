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
    private final List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        bfs(root);

        return result;
    }

    private void bfs(TreeNode root)
    {
        if (root == null)
        {
            return;
        }

        // If root is in left and right, then 
        bfs(root.left);

        result.add(root.val);

        bfs(root.right);
    }
}