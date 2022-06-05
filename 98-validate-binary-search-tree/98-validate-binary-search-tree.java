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
    public boolean isValidBST(TreeNode root) {
      List<Integer> nodeVal = new ArrayList<>();
      List <Integer> output = preOrder(root, nodeVal);
        for(int i=0;i<output.size()-1; i++){
            if(output.get(i)>= output.get(i+1) )
                return false;
        }
        return true;
    }
    
    public List<Integer> preOrder(TreeNode root, List<Integer> list){
        if(root != null){
            preOrder(root.left, list);
            list.add(root.val);
            preOrder(root.right, list);
        }
            return list;
    }
}