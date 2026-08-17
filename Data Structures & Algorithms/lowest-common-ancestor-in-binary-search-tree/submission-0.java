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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int minVal = p.val < q.val ? p.val : q.val;
        int maxVal = p.val > q.val ? p.val : q.val;
        int currVal = root.val;
        while (currVal > maxVal || currVal < minVal) {
            if (currVal > maxVal) {
                root = root.left;
            }
            if (currVal < minVal) {
                root = root.right;
            }
            currVal = root.val;
        }

        return root;
    }
}
