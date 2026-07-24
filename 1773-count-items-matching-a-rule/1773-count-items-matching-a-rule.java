class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0,index;
        if(ruleKey.equals("type")){
            index=0;
        }
        else if(ruleKey.equals("color")){
            index=1;
        }
        else index=2;
        for(List<String> s:items){
            if(s.get(index).equals(ruleValue)){
                c++;
            }
        }
        return c;
    }
}