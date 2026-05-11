class Solution {
    public int countnow(String s1){
        int v=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='a' ||s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'){
                v++;
            }
        }
        return v;
    }
    public String reverse (String s){
        StringBuilder s2=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            s2.append(s.charAt(i));
        }
        return s2.toString();
    }
    public String reverseWords(String s) {
        if(s.length()==1) return s;
        String words[]=s.split(" ");
        int c=countnow(words[0]);
        StringBuilder sb=new StringBuilder("");
        sb.append(words[0]);
        for(int i=1;i<words.length;i++){
            if(countnow(words[i])==c){
                sb.append(" ");
                sb.append(reverse(words[i]));
            }
            else{
                sb.append(" ");
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }
}
