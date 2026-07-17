class Solution {
    public String processStr(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(result.length()>0){
                    result=result.substring(0,result.length()-1);
                }
            }
            else if(s.charAt(i)=='#'){
                result+=result;
            }
            else if(s.charAt(i)=='%'){
                char[]arr=result.toCharArray();
                result="";
                for(int j=arr.length-1;j>=0;j--){
                    result+=arr[j];
                }
            }   
            else{
                result+=s.charAt(i);
            }
        }
        return result;
    }
}