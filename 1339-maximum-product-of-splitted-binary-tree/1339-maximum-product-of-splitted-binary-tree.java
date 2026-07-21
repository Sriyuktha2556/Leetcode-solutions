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
    long max=0;
    long total=0;
    int mod=1000000007;
    public int maxProduct(TreeNode root) {
        total=sum(root);
        subtree(root);
        return (int)(max%mod);
    }
    public long sum(TreeNode root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public long subtree(TreeNode root){
        if(root==null) return 0;
        long c=root.val+subtree(root.left)+subtree(root.right);
        max=Math.max(max,c*(total-c));
        return c;
    }
}