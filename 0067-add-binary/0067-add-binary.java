class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
       String s="";
       while(i>=0 || j>=0 || c==1){
        int A=(i>=0)? a.charAt(i--)-'0' :0;
        int B=(j>=0)? b.charAt(j--)-'0' :0;
        int sum=A+B+c;
        s=(sum%2)+s;
        c=sum/2;
       }
       return s;
    }
}