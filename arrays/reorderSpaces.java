class Solution {
    public String reorderSpaces(String text) {
         int spaces=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                spaces++;
            }
        }
        String str=text.trim().replaceAll("\\s+"," ");
        int len=0,ts=0,es=0;
        String words[]=str.split(" ");
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<words.length;i++){
            len=words.length-1;
            if(len==0){
                sb.append(words[i]);
                while(spaces>0){
                    sb.append(" ");
                    spaces--;
                }
                return sb.toString();
            }
            ts=spaces/len;
            es=spaces%len;
            sb.append(words[i]);
            // System.out.println(ts);
            while(ts>0 && (i!=words.length-1)){
                sb.append(" ");
                ts--;
            }
        }
        while(es>0){
            sb.append(" ");
            es--;
        }
        return sb.toString();


        
    }
}
