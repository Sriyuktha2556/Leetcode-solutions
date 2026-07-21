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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return solution(root).node;
    }
    public Tree solution(TreeNode root){
        if(root==null) return new Tree(null,0);
        Tree l=solution(root.left);
        Tree r=solution(root.right);
        if(l.dist>r.dist) return new Tree(l.node,l.dist+1);
        if(l.dist<r.dist) return new Tree(r.node,r.dist+1);
        return new Tree(root,l.dist+1);
    }
    class Tree{
        TreeNode node;
        int dist;
        Tree(TreeNode n, int d){
            node=n;
            dist=d;
        }
    }
}