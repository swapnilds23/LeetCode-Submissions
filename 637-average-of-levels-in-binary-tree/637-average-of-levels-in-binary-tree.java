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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> output = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        
        while(!treeNodes.isEmpty()){
            int queueSize = treeNodes.size(), totalElements = treeNodes.size();
            double sum = 0;
            
            while(queueSize > 0){
                TreeNode currentNode = treeNodes.poll();
                sum = sum + currentNode.val;
                if(currentNode.left != null)
                    treeNodes.add(currentNode.left);
                if(currentNode.right != null)
                    treeNodes.add(currentNode.right);
                queueSize --;
            }
            output.add(sum/totalElements);
                 
        }
        return output;
    }
}