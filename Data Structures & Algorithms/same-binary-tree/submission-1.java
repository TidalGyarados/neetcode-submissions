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
    boolean sameTree = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverseTree(p,q);
        return sameTree;
    }

    void traverseTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return;
        } else if (p == null || q == null) {
            sameTree = false;
            return;
        } else if (p.val != q.val) {
           sameTree = false; 
           return;
        }
        traverseTree(p.left, q.left);
        traverseTree(p.right, q.right);
        return;

    }
}
