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
    public List<Integer> preorderTraversal(TreeNode root) {
          List<Integer> treeNodes = new ArrayList<>();
        helper(root, treeNodes);
        return treeNodes;
        
    }
    
     public void helper(TreeNode root, List<Integer> treeNodes) {
        if (root != null) {
            treeNodes.add(root.val);
            helper(root.left, treeNodes);
            helper(root.right, treeNodes);
        }
    }

}