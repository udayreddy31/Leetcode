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
    public List<Integer> largestValues(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
     if (root == null)
     {
        return new ArrayList<>();
     }   
     List<Integer> res = new ArrayList<>();
     q.offer(root);
     while(!q.isEmpty()){
        int size = q.size();
        int high = q.peek().val;
        for(int i=0;i<size;i++){
            TreeNode ele = q.poll();
            if(high<ele.val){
                high = ele.val;
            }
            if(ele.left != null)
                q.offer(ele.left);
            if(ele.right!=null)
                q.offer(ele.right);
        }
        res.add(high);
     }
     return res;
        
    }
}