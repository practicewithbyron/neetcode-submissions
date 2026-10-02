class Solution {
    private boolean isValid = true;

    public boolean isValidBST(TreeNode root) {
        dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return isValid;
    }

    private void dfs(TreeNode root, int curMin, int curMax) {
        if (root == null || !isValid) {
            return;
        }

        if (root.left != null) {
            if (root.left.val >= root.val || root.left.val <= curMin) {
                isValid = false;
                return;
            }
        }

        if (root.right != null) {
            if (root.right.val <= root.val || root.right.val >= curMax) {
                isValid = false;
                return;
            }
        }

        dfs(root.left, curMin, root.val);
        dfs(root.right, root.val, curMax);
    }
}