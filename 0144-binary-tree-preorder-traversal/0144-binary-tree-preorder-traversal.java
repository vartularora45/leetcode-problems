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
       List<Integer> l = new ArrayList<Integer>();
       pre(l,root);
       return l; 
    }
    public void pre(List<Integer> l,TreeNode r){
        if(r==null){
            return;

        }
        l.add(r.val);
        pre(l,r.left);
        pre(l,r.right);


    }
}