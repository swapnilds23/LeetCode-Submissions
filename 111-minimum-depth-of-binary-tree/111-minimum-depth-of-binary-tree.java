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
    public int minDepth(TreeNode root) {
        int depth = 1;
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
           int queueSize = queue.size();
            
            for(int i=0; i<queueSize; i++){
                TreeNode q = queue.poll();
                if(q.left == null && q.right == null)
                    return depth;
                if(q.left != null)
                    queue.offer(q.left);
                if(q.right != null)
                    queue.offer(q.right);
            }
            depth++;
            
        }
        return depth;
    }
}