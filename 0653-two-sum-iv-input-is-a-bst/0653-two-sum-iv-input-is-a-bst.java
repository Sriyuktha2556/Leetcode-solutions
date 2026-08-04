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
    public boolean findTarget(TreeNode root, int k) {
        Inorder In=new Inorder(root);
        RevInorder Rev=new RevInorder(root);
        TreeNode p1=In.getnext();
        TreeNode p2=Rev.getnext();
        while(p1!=p2){
            if(p1.val+p2.val==k) return true;
            else if(p1.val+p2.val<k){
                p1=In.getnext();
            }
            else{
                p2=Rev.getnext();
            }
        }
        return false;
    }
}

class Inorder {
    Stack<TreeNode> st;
    public Inorder(TreeNode root){
        st=new Stack<>();
        pushleftnode(root);
    }

    public boolean hasnext(){
        if(st.isEmpty()) return false;
        return true;
    }

    public TreeNode getnext(){
        if(hasnext()){
            TreeNode X=st.pop();
            if(X.right!=null){
                pushleftnode(X.right);
            }
            return X;
        }
        return null;
    }

    public void pushleftnode(TreeNode root){
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }
}

class RevInorder {
    Stack<TreeNode> st;
    public RevInorder(TreeNode root){
        st=new Stack<>();
        pushrightnode(root);
    }

    public boolean hasnext(){
        if(st.isEmpty()) return false;
        return true;
    }

    public TreeNode getnext(){
        if(hasnext()){
            TreeNode X=st.pop();
            if(X.left!=null){
                pushrightnode(X.left);
            }
            return X;
        }
        return null;
    }

    public void pushrightnode(TreeNode root){
        while(root!=null){
            st.push(root);
            root=root.right;
        }
    }
}