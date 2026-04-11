class Solution {
    public boolean ispresent(String s,String allowed){
        for(int i=0;i<s.length();i++){
            if(!allowed.contains(s.charAt(i)+"")) return false;
        }
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            if(ispresent(words[i],allowed)) c++;
        }
        return c;
    }
}
