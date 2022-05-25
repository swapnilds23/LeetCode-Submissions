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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> nodeValues = new ArrayList<>();
        helper(root, nodeValues);
        return nodeValues;
    }
    
    public void helper(TreeNode root, List<Integer> nodeValues){
        if(root != null){
            helper(root.left, nodeValues);
            helper(root.right, nodeValues);
            nodeValues.add(root.val);
        }
    }
}