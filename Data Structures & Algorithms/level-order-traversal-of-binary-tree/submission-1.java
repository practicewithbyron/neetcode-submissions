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
    private final List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        traverse(root, 0);
        return result;
    }

    private void traverse(TreeNode root, int depth)
    {
        if (root == null)
        {
            return;
        }

        if (result.size() < depth + 1)
        {
            result.add(new ArrayList<>());
        }

        traverse(root.left, depth + 1);
        traverse(root.right, depth + 1);
        
        List<Integer> depthList = result.get(depth);
        depthList.add(root.val);
    }
}
