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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> returnList = new ArrayList<>();
        Queue<TreeNode> bfsQueue = new LinkedList<>();
        if (root != null) {
            bfsQueue.add(root);
        }
        while(!bfsQueue.isEmpty()) {
            int size = bfsQueue.size();
            for(int i=0; i < size; i++) {
                TreeNode node = bfsQueue.remove();
                if(i == 0) {
                    returnList.add(node.val);
                }
                if (node.right != null) {
                    bfsQueue.add(node.right);
                }
                if (node.left != null) {
                    bfsQueue.add(node.left);
                }
            }
        }
        return returnList;
    }
}
