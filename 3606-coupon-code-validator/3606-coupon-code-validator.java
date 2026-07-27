class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> result=new ArrayList<>();
        List<String> a=new ArrayList<>();
        List<String> b=new ArrayList<>();
        List<String> c=new ArrayList<>();
        List<String> d=new ArrayList<>();
        for(int i=0;i<isActive.length;i++){
            if(isActive[i]==true){
                if(businessLine[i].equals("electronics")||businessLine[i].equals("grocery")||businessLine[i].equals("pharmacy")||businessLine[i].equals("restaurant")){
                    if(code[i].length()==0) continue;
                    boolean found=true;
                    for(int j=0;j<code[i].length();j++){
                        char ch=code[i].charAt(j);
                        if(!Character.isLetterOrDigit(ch) && ch!='_'){
                            found=false;
                            break;
                        }
                    }
                    if(found==true){
                        if(businessLine[i].startsWith("e")) a.add(code[i]);
                        if(businessLine[i].startsWith("g")) b.add(code[i]);
                        if(businessLine[i].startsWith("p")) c.add(code[i]);
                        if(businessLine[i].startsWith("r")) d.add(code[i]);
                    }
                }
            }
        }
        Collections.sort(a);
        Collections.sort(b);
        Collections.sort(c);
        Collections.sort(d);
        result.addAll(a);
        result.addAll(b);
        result.addAll(c);
        result.addAll(d);

        return result;
    }
}