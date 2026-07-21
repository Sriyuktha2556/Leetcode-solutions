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
    public int maxLevelSum(TreeNode root) {
        int level=1,p=0;
        int max=Integer.MIN_VALUE;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode X=q.poll();
                sum+=X.val;
                if(X.left!=null) q.add(X.left);
                if(X.right!=null) q.add(X.right);
            }
            if(sum>max){
                max=sum;
                p=level;
            }
            level++;
        }
        return p;
    }
}
