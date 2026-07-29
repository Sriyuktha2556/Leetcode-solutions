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
    List<Integer> x=new ArrayList<>();
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        inorderTraversal(root);
        int i=bsl(0,x.size()-1,x,low);
        int j=bsh(0,x.size()-1,x,high);
        for(int k=i;k<=j;k++){
            sum+=x.get(k);
        }
        return sum;
    }
    public void inorderTraversal(TreeNode root) {
        if(root==null) return;
        inorderTraversal(root.left);
        x.add(root.val);
        inorderTraversal(root.right);
    }
    public int bsl(int l, int h, List<Integer> x, int low){
        while(l<=h){
            int mid=(l+h)/2;
            if(x.get(mid)==low){
                return mid;
            }
            else if(x.get(mid)<low){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
    public int bsh(int l, int h, List<Integer> x, int high){
        while(l<=h){
            int mid=(l+h)/2;
            if(x.get(mid)==high){
                return mid;
            }
            else if(x.get(mid)<high){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}