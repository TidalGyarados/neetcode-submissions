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
    public int goodNodes(TreeNode root) {
        int result = 0;
        if (root != null) {
            result = dfs(root, root.val);
        }
        return result;
    }

    int dfs(TreeNode node, int max) {
        int result = 0;
        if (node == null) {
            return 0;
        }

        if (node.val >= max) {
            result++;
            max = node.val;
        }
        result = result + dfs(node.left, max);
        result = result + dfs(node.right, max);
        return result;
    }
}
