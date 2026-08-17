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
    int returnValue = 0;
    int counter = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);
        return returnValue;
    }

    void inorderTraversal(TreeNode node, int k) {
        if (node == null || counter > k) {
            return;
        }
        inorderTraversal(node.left, k);
        counter++;
        if (counter == k) {
            returnValue = node.val;
            return;
        }
        inorderTraversal(node.right, k);
    }
}
