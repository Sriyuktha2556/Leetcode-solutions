class Solution {
    public long sumAndMultiply(int n) {
        long x=0,sum=0;
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            int r=s.charAt(i)-'0';
            if(r!=0){
                x=(x*10)+r;
            }
        }
        long x1=x;
        while(x1!=0){
            sum+=x1%10;
            x1/=10; 
        }
        return sum*x;
    }
}