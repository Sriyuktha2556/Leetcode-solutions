class Solution {
    public String smallestSubsequence(String s) {
        //store last occurence of the character
        int[]c=new int[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']=i;
        }

        //initialize a visited array and a stack and if character is not visited then compare with top character i 
        boolean[]visited=new boolean[26];
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
        
            char ch=s.charAt(i);
            if(visited[ch-'a']==true) continue;
            while(!stack.isEmpty() && stack.peek()>ch && c[stack.peek()-'a']>i ){
                visited[stack.pop()-'a']=false;
            }
            stack.push(ch);
            visited[ch-'a']=true;
        }
        String result="";
        for(char ch:stack){
            result+=ch;
        }
        return result;
    }
}