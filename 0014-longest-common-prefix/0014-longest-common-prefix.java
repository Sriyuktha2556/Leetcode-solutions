class Node{
    Node[]child;
    int count;
    Node(){
        child=new Node[26];
        count=0;
        for(int i=0;i<26;i++){
            child[i]=null;
        }
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Node root=new Node();
        for(int i=0;i<strs.length;i++){
            insert(root,strs[i]);
        }
        return find(root,strs[0],strs.length);
    }
    public void insert(Node root, String str){
        Node tr=root;
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            if(tr.child[idx]==null){
                tr.child[idx]=new Node();
            }
            tr=tr.child[idx];
            tr.count++;
        }
    }
    public String find(Node root,String str,int n){
        Node tr=root;
        String s="";
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            if(tr.child[idx]==null){
                break;
            }
            if(tr.child[idx].count==n){
                s+=str.charAt(i);
                tr=tr.child[idx];
            }
            else{
                break;
            }
        }
        return s;
    }
}