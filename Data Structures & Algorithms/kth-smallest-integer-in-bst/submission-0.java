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
    private final List<Integer> minStack = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        // Act like a stack?
        // Create a stack of k length
        // Add to stack, get the last value
        dfs(root);
        for (var el : minStack)
        {
            System.out.println(el);
        }
        return minStack.get(k - 1);
    }

    private void dfs(TreeNode root)
    {
        if (root == null)
        {
            return;
        }

        dfs(root.left);

        minStack.add(root.val);

        dfs(root.right);
    }
}
