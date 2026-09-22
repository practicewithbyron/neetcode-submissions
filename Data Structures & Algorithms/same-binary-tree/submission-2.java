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
    private final List<Integer> pList = new ArrayList<>();
    private final List<Integer> qList = new ArrayList<>();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Traverse through, keep a record of nulls
        // Then compare results
        pList.add(traverseTree(p, pList));
        qList.add(traverseTree(q, qList));

        System.out.println(pList);
        System.out.println(qList);
        
        if (pList.size() != qList.size())
        {
            return false;
        }

        for (int i = 0; i < pList.size(); i++)
        {
            if (pList.get(i) != qList.get(i))
            {
                return false;
            }
        }

        return true;
    }

    private Integer traverseTree(TreeNode root, List<Integer> list)
    {
        if (root == null)
        {
            return null;
        }

        Integer left = traverseTree(root.left, list);
        Integer right = traverseTree(root.right, list);
        list.add(left);
        list.add(right);

        return root.val;
    }
}
