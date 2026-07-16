class Solution {
    public int maxNumberOfBalloons(String text) {
        int[]a=new int[5];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='b') a[0]++;
            else if(ch=='a') a[1]++;
            else if(ch=='l') a[2]++;
            else if(ch=='o') a[3]++;
            else if(ch=='n') a[4]++;
        }
        return Math.min(Math.min(a[0],a[1]),Math.min(a[4],Math.min(a[2]/2,a[3]/2)));
    }
}