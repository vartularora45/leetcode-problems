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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
             int n = q.size();
             ArrayList<Integer> l = new ArrayList<>();
             for(int i=0;i<n;i++){
                TreeNode x = q.poll();
                l.add(x.val);
                if(x.left != null) q.offer(x.left);
                if(x.right != null) q.offer(x.right);

             }
             res.add(l);
        }
        Collections.reverse(res);
      return res;
    }
}