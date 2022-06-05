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
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        if(root == null)
            return output;
        queue.offer(root);
        while(!queue.isEmpty()){
            int queueSize =queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=1; i<=queueSize; i++ ){
               
                if(queue.peek().left != null)
                queue.add(queue.peek().left);
                if(queue.peek().right != null)
                queue.add(queue.peek().right);

                currentLevel.add( queue.poll().val);
            }
            output.add(currentLevel);
        }
        return output;
    }
}