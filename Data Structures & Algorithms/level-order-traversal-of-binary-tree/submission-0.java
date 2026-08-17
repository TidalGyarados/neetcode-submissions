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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queueList = new LinkedList<>();
        List<List<Integer>> returnList = new ArrayList<>();
        if (root != null) {
            queueList.add(root);
        }
        while(!queueList.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int size = queueList.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queueList.remove();
                levelList.add(node.val);
                if (node.left != null) {
                    queueList.add(node.left);
                }
                if (node.right != null) {
                    queueList.add(node.right);
                }
            }

            returnList.add(levelList);
        }
        return returnList;
        
    }
}
