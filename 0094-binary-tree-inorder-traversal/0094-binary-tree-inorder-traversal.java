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
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> l = new ArrayList<Integer>();
      inorder(root,l);
      return l;  
    }
    public void inorder(TreeNode r,List<Integer> l){
        if(r == null){
            return;
        }
        inorder(r.left,l);
        l.add(r.val);
        inorder(r.right,l);
    }
}