class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int max=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int indx=sb.indexOf(String.valueOf(ch));
            if(indx!=-1){
                sb.delete(0,indx+1);
            }
            sb.append(ch);
            max=Math.max(max,sb.length());
        }
        return max;

    }
}
