class Solution {
    public String mask(String s){
        s=s.toLowerCase();
        int j=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='@'){
                j=i;
                break;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        StringBuilder ss=new StringBuilder();
        ss.append(sb.charAt(0));
        ss.append("*****");
        ss.append(sb.charAt(sb.length()-1));
        ss.append("@");
        for(int k=j+1;k<s.length();k++){
            ss.append(s.charAt(k));
        }
        return ss.toString();
    }
    public String masknum(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        StringBuilder ss=new StringBuilder();
        if(sb.length()==10){
           ss.append("***-***-") ;
        }
        else if(sb.length()==11){
            ss.append("+*-***-***-");
        }
        else if(sb.length()==12){
            ss.append("+**-***-***-");
        }
        else{
            ss.append("+***-***-***-");
        }
        String str=sb.toString();
        ss.append(str.substring(str.length()-4,str.length()));
        return ss.toString();
    }
    public String maskPII(String s) {
        if(s.contains("@")){
            return mask(s);
        }
        return masknum(s);
        
    }
}
