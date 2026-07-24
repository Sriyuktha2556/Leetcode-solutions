class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> h=new HashMap<>();
        int a=97;
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)==' ') continue;
            if(!h.containsKey(key.charAt(i))){
                h.put(key.charAt(i),(char)(a));
                a++;
            }
        }
        String result="";
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                result+=' ';
            }
            else{
                result+=h.get(message.charAt(i));
            }
        }
        return result;
    }
}