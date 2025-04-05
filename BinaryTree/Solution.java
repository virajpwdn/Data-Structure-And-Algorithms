import javax.swing.tree.TreeNode;

public class Solution {
    public int max = 0;
    public int solve(TreeNode root) {
        if(root == null) return 0;

        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        int diameter = left + right;
        max = Math.max(max, diameter);

        int height = Math.max(height,left + right) + 1;
        return height;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return max;
    }
}
