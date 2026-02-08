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
        List<Double> avg = new ArrayList<>();

        if(root == null){
            return avg;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            Double s = 0.0;
            for(int i=0;i<n;i++){
                TreeNode x = q.poll();
                s += x.val;
                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);

            }
            avg.add(s/n);

        }
        return avg;
    }
}